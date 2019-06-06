package com.tjrac.contact.servlet;

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class ShowAllcontactServlet
 */
@WebServlet("/ShowAllcontactServlet")
public class ShowAllcontactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAllcontactServlet() {
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
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		String username = (String) session.getAttribute("username");
		out.println(username);
		IGroupService iGroupService = new GroupServiceImpl();
		List<Group> groupList = iGroupService.showAllGroup(username);
		IContactService iContactService = new ContactServiceImpl();
		List<Contact> contactList = iContactService.showAllContact(username);
		
		out.println(session.getAttribute("username"));
		
		request.setAttribute("contactList", contactList);
		request.setAttribute("groupList", groupList);
		request.getRequestDispatcher("showAllContact.jsp").forward(request, response);
		//response.sendRedirect("showAllContact.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
