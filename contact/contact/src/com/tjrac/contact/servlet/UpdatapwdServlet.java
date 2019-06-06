package com.tjrac.contact.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tjrac.contact.service.IAccountService;
import com.tjrac.contact.service.IContactService;
import com.tjrac.contact.service.impl.AccountServiceImpl;
import com.tjrac.contact.service.impl.ContactServiceImpl;

/**
 * Servlet implementation class UpdatapwdServlet
 */
@WebServlet("/UpdatapwdServlet")
public class UpdatapwdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatapwdServlet() {
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
		String newpwd = request.getParameter("newpwd");
		IAccountService iAccountService = new AccountServiceImpl();
		int affectedRows = iAccountService.updatePwd(username, newpwd);
		
		if(affectedRows>0) {
			out.println("<script>alert('修改密码成功');window.location.href='CancelloginServlet'</script>");
		}else {
			out.println("<script>alert('修改密码失败');window.location.href='ShowAllcontactServlet'</script>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
