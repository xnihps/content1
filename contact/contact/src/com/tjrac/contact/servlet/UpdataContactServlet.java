package com.tjrac.contact.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tjrac.contact.pojo.Contact;
import com.tjrac.contact.service.IContactService;
import com.tjrac.contact.service.impl.ContactServiceImpl;

/**
 * Servlet implementation class UpdataContactServlet
 */
@WebServlet("/UpdataContactServlet")
public class UpdataContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdataContactServlet() {
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
		
		int cid = Integer.parseInt(request.getParameter("cid"));
		int gid = Integer.parseInt(request.getParameter("gid"));
		String username = (String) session.getAttribute("username");
		String cname = request.getParameter("cname");
		String csex = request.getParameter("csex");
		String mphone = request.getParameter("mphone");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		String qq = request.getParameter("qq");
		String dept = request.getParameter("dept");
		String address = request.getParameter("address");
		Contact contact = new Contact( cname,csex,mphone,tel,email,qq,dept,address,gid,username,cid );
		
		IContactService iContactService = new ContactServiceImpl();
		int affectedRows = iContactService.updataContact(contact, cid);
		
		if(affectedRows>0) {
			out.println("<script>alert('修改成功');window.location.href='ShowAllcontactServlet'</script>");
		}else {
			out.println("<script>alert('修改失败');window.location.href='ShowAllcontactServlet'</script>");
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
