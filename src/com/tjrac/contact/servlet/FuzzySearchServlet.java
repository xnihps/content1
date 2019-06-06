package com.tjrac.contact.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tjrac.contact.pojo.Contact;
import com.tjrac.contact.pojo.Group;
import com.tjrac.contact.service.IContactService;
import com.tjrac.contact.service.IGroupService;
import com.tjrac.contact.service.impl.ContactServiceImpl;
import com.tjrac.contact.service.impl.GroupServiceImpl;

/**
 * Servlet implementation class FuzzySearchServlet
 */
@WebServlet("/FuzzySearchServlet")
public class FuzzySearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FuzzySearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		HttpSession session = request.getSession();
		
		String temp = request.getParameter("temp");
		
		request.setAttribute("temp", temp);
		String username = (String) session.getAttribute("username");
		IContactService iContactService = new ContactServiceImpl();
		List<Contact> contactList = iContactService.showAllContactByCname(temp);
		
		
		if(null == contactList || contactList.size() ==0) {
			contactList = iContactService.showAllContactByCsex(temp);
				if(null == contactList || contactList.size() ==0) {
					IGroupService iGroupService = new GroupServiceImpl();
					List<Group> groupList = iGroupService.showGroupByGname(temp, username);
					if(null == groupList || groupList.size() ==0) {
						request.getRequestDispatcher("showFuzzySearch.jsp").forward(request, response);
					}else {
						contactList = iContactService.showAllContact(username);
						request.setAttribute("groupList", groupList);
						request.setAttribute("contactList", contactList);
						request.getRequestDispatcher("showFuzzySearch.jsp").forward(request, response);
					}
				}else {
					request.setAttribute("contactList", contactList);
					request.getRequestDispatcher("showFuzzySearch.jsp").forward(request, response);
				}
		}else {
				request.setAttribute("contactList", contactList);
				request.getRequestDispatcher("showFuzzySearch.jsp").forward(request, response);
			}
		request.setAttribute("contactList", contactList);
		request.getRequestDispatcher("showFuzzySearch.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
