<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="com.tjrac.contact.pojo.Group"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<style type="text/css">

input {
	padding-left: 5px;
	
}
</style>
</head>
<body bgcolor="antiquewhite">
			<%
				out.println("欢迎你，" + session.getAttribute("username"));
				/*for(int i=0;i<groupList.size();i++){
					out.println(groupList.get(i).getGname()+"<br/>");
				}*/
			%>
			<c:if test="${empty requestScope.groupList }">
				<script>
					alert("没有分组，请添加")
				</script>
			</c:if>
			<h3>
				分组管理&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="addGroup.jsp">添加分组</a>
			</h3>
			<table border="1" cellspacing="0">
				<tr>
					<th>分组管理</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${requestScope.groupList}" var="group">
					<tr>
						<td>${group.gname}</td>
						<td><a href="updataGroup.jsp?gid=${group.gid}">更改分组名</a>&nbsp;&nbsp;&nbsp;&nbsp;<a
							href="addcontact.jsp?gid=${group.gid}">添加联系人</a></td>
					</tr>
					<tr>
						<td>
							<table border="1" cellspacing="0">
								<tr>
									<th>姓名</th>
									<th>性别</th>
									<th>移动电话</th>
									<th>固定电话</th>
									<th>电子邮箱</th>
									<th>QQ</th>
									<th>单位地址</th>
									<th>居住地址</th>
									<th>操作</th>
								</tr>
								<c:forEach items="${requestScope.contactList}" var="contact">
									<c:if test="${contact.gid==group.gid}">
										<tr>
											<td>${contact.cname}</td>
											<td>${contact.csex}</td>
											<td>${contact.mphone}</td>
											<td>${contact.tel}</td>
											<td>${contact.email}</td>
											<td>${contact.qq}</td>
											<td>${contact.dept}</td>
											<td>${contact.address}</td>
											<td><a href="updataConcact.jsp?cid=${contact.cid}">修改联系人</a>&nbsp;&nbsp;&nbsp;&nbsp;<a
												href="delectConcact.jsp?cid=${contact.cid}">删除联系人</a></td>
										</tr>
									</c:if>
								</c:forEach>
							</table>
						</td>
					</tr>
				</c:forEach>
			</table>
</body>
</html>