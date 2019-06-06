package com.tjrac.contact.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tjrac.contact.pojo.Account;
import com.tjrac.contact.service.IAccountService;
import com.tjrac.contact.service.impl.AccountServiceImpl;

/**
 * Servlet implementation class RigisterServlet
 */
@WebServlet("/RigisterServlet")
public class RigisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RigisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		Account account = new Account(username,pwd);
		
		
		if(pwd.length()!=0&&username.length()!=0) {
			
			IAccountService iAccountService = new AccountServiceImpl();
			int affectedRows= iAccountService.addnewAccount(username);
			String clientCheckcode = request.getParameter("validateCode");//接收客户端浏览器提交上来的验证码
	        String serverCheckcode = (String) request.getSession().getAttribute("checkcode");//从服务器端的session中取出验证码
	        
			
			if(affectedRows<0) {
				if (clientCheckcode.equals(serverCheckcode)) {//将客户端验证码和服务器端验证比较，如果相等，则表示验证通过
					iAccountService.addAccount(account);
					out.println("<script>alert('恭喜你,注册成功！');window.location.href='login.html'</script>");
		        }else {
		        	out.println("<script>alert('验证码错误，请重新输入验证码');window.location.href='rigister.jsp'</script>");
		        }
			}else {
				out.println("<script>alert('对不起，注册失败，请重新输入账号。');window.location.href='rigister.jsp'</script>");
			}
			
		}else {
			out.println("<script>alert('对不起，账号密码不能为空，请重新输入。');window.location.href='login.html'</script>");
		}
		
		
	}

}
