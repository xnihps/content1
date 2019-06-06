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
	width: 500px;
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
<body bgcolor="antiquewhite"><div class="center-in-center">
		<fieldset><legend><h3>创建分组</h3></legend>
<center>
	<form action="AddGroupServlet" method="post">
		请输入要创建的组名：<input type="text" name="newgname" value=""/><br /><br />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit"  value="确&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;认" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</form>
	<a href="ShowAllcontactServlet"><button>返&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;回</button></a><br />
	</center></fieldset></div>
</body>
</html>