<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="com.tjrac.contact.pojo.Contact"%>
<%@page import="com.tjrac.contact.service.impl.ContactServiceImpl"%>
<%@page import="com.tjrac.contact.service.IContactService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<style type="text/css">
div {
	width: 300px;
	height: 300px;
}

.center-in-center {
	position: absolute;
	top: 40%;
	left: 50%;
	-webkit-transform: translate(-50%, -50%);
	-moz-transform: translate(-10%, -10%);
	-ms-transform: translate(-10%, -10%);
	-o-transform: translate(-10%, -10%);
	transform: translate(-50%, -50%);
}

fieldset {
	margin: auto;
	width: 350px;
	border-radius: 25px;
}

input {
	padding-left: 5px;
}
</style>
</head>
<body bgcolor="antiquewhite"><div class="center-in-center"><fieldset ><legend><h3>更改联系人</h3></legend>
	<%
		Integer gid = request.getParameter("gid") != null && !request.getParameter("gid").equals("") ? Integer.parseInt(request.getParameter("gid")) : null;
		Integer cid = request.getParameter("cid") != null && !request.getParameter("cid").equals("") ? Integer.parseInt(request.getParameter("cid")) : null;
		IContactService iContactService = new ContactServiceImpl();
		Contact contact = iContactService.showAllContactByCid(cid);
	%>
	<form action="UpdataContactServlet?gid=<%=gid%>&cid=<%=cid%>" method="post"><center>
		联系人姓名：<input type="text" name="cname" value="<%=contact.getCname()%>"/><br /><br />
		性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
						type="radio" name="csex" value="男" checked="checked"/>男&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="radio" name="csex" value="女" />女<br /> <br />
		联系电话：<input type="text" name="mphone" value="<%=contact.getMphone()%>"/><br /><br />
		固定电话：<input type="text" name="tel" value="<%=contact.getTel()%>"/><br /><br />
		电子邮箱：<input type="text" name="email" value="<%=contact.getEmail()%>"/><br /><br />
		Q&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Q：<input type="text" name="qq" value="<%=contact.getQq()%>"/><br /><br />
		工作单位：<input type="text" name="dept" value="<%=contact.getDept()%>"/><br /><br />
		地&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址：<input type="text" name="address" value="<%=contact.getAddress()%>"/><br /><br />
		<input type="submit"
						value="修&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;改" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</center></form>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="ShowAllcontactServlet"><button>返&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;回</button></a><br />
	</fieldset></div>
</body>
</html>