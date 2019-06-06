<?xml version="1.0" encoding="UTF-8" ?>
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
<body bgcolor="antiquewhite">
	<div class="center-in-center">
		<fieldset>
			<legend>
				<h3>添加联系人</h3>
			</legend>
			<%
				Integer gid = request.getParameter("gid") != null && !request.getParameter("gid").equals("")
						? Integer.parseInt(request.getParameter("gid")) : null;
			%>
			<form action="AddContactServlet?gid=<%=gid%>" method="post">
				<center>
					联系人姓名：<input type="text" name="cname" /><br /> <br />
					性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
						type="radio" name="sex" value="male" />男&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="radio" name="sex" value="female" />女<br /> <br />
					联系电话：<input type="text" name="mphone" /><br /> <br /> 固定电话：<input
						type="text" name="tel" /><br /> <br /> 电子邮箱：<input type="text"
						name="email" /><br /> <br />
					Q&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Q：<input
						type="text" name="qq" /><br /> <br /> 工作单位：<input type="text"
						name="dept" /><br /> <br />
					地&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址：<input
						type="text" name="address" /><br /> <br /> <input type="submit"
						value="添&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;加" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="reset" value="取&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;消" /><br />
				</center>
			</form>
		</fieldset>
	</div>
</body>
</html>