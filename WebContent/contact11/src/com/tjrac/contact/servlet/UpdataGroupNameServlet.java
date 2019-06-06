package com.tjrac.contact.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tjrac.contact.service.IGroupService;
import com.tjrac.contact.service.impl.GroupServiceImpl;

/**
 * Servlet implementation class UpdataGroupNameServlet
 */
@WebServlet("/UpdataGroupNameServlet")
public class UpdataGroupNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdataGroupNameServlet() {
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
		
		int gid = Integer.parseInt(request.getParameter("gid"));
		String gname = request.getParameter("newgname");
		//Integer gid = request.getParameter("gid") != null && !request.getParameter("gid").equals("") ? Integer.parseInt(request.getParameter("gid")) : null;
		
		
		//out.println(gid);
		//out.println(gname);
		IGroupService iGroupService = new GroupServiceImpl();
		int affectedRows=iGroupService.updataGroup(gname, gid);
		
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
