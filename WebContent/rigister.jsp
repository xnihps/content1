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
<script type="text/javascript">
    		//刷新验证码
    		function changeImg(){
        	document.getElementById("validateCodeImg").src="IdentifyingcodeServlet?"+Math.random();
    		}
    	</script>
</head>
<body bgcolor="antiquewhite"><div class="center-in-center"><fieldset><legend><h3>用户注册</h3></legend>
<center>
<form action="RigisterServlet" method="post">
	用户账号：<input type="text" name="username" /><br /><br />
	用户口令：<input type="password" name="pwd" /><br /><br />
	验&nbsp;&nbsp;证&nbsp;&nbsp;码：<input type="text" name="validateCode"/><br />
            <img alt="验证码看不清，换一张" src="IdentifyingcodeServlet" id="validateCodeImg" onclick="changeImg()">
            <a href="javascript:void(0)" onclick="changeImg()">看不清，换一张</a><br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="submit"  value="注&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;册" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="reset" value="取&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;消" /><br />
</form>
</center></fieldset>
</div>
</body>
</html>