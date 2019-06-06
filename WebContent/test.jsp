<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="com.tjrac.contact.service.impl.ContactServiceImpl"%>
<%@page import="com.tjrac.contact.service.IContactService"%>
<%@page import="com.tjrac.contact.dao.impl.ContactDaoImpl"%>
<%@page import="com.tjrac.contact.dao.IContactDao"%>
<%@page import="com.tjrac.contact.pojo.Contact"%>
<%@page import="oracle.jrockit.jfr.tools.ConCatRepository"%>
<%@page import="com.tjrac.contact.service.impl.GroupServiceImpl"%>
<%@page import="com.tjrac.contact.service.IGroupService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tjrac.contact.pojo.Group"%>
<%@page import="java.util.List"%>
<%@page import="com.tjrac.contact.dao.impl.GroupsDaoImpl"%>
<%@page import="com.tjrac.contact.dao.IGroupsDao"%>
<%@page import="com.tjrac.contact.service.impl.AccountServiceImpl"%>
<%@page import="com.tjrac.contact.service.IAccountService"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.tjrac.contact.dao.impl.AccountDaoImpl"%>
<%@page import="com.tjrac.contact.dao.IAccountDao"%>
<%@page import="com.tjrac.contact.pojo.Account"%>
<%@page import="com.tjrac.contact.util.SQLManager"%>
<%@page import="com.tjrac.contact.util.ConnectionManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<%
		ConnectionManager connectionManager = new ConnectionManager();
		Connection connection = connectionManager.getConnection();
		if(connection!=null)
		{
			out.println("连接建立成功<br/>");
		}
		else{
			out.println("连接建立失败<br/>");
		}
		Account account=new Account("root","123456");
		String username="root";
		String cname="魏";
		int gid =2;
		IContactDao iContactDao = new ContactDaoImpl();
		ResultSet rs = iContactDao.SelectContactByCname(cname, connection);
		
		if(rs.next()){
			out.println("1");
			//out.println(rs.getArray(cname));
		}
		else{
			out.println("2");
		}
		
		IContactService iContactService = new ContactServiceImpl();
		List<Contact> contactlist = iContactService.showAllContactByCname(cname);
		
		for(int i=0;i<contactlist.size();i++){
			out.println(contactlist.get(i).getCname());
		}
		/*group测试
		IGroupService iGroupService = new GroupServiceImpl();
		int affectedRows=iGroupService.updataGroup(gname, gid);
		IGroupsDao iGroupsDao = new GroupsDaoImpl();
		int affectedRows = iGroupsDao.updataGroupByGid(gname, gid, connection);
		
		if(affectedRows>0) {
			out.println("<script>alert('修改成功');window.location.href='ShowAllcontactServlet'</script>");
		}else {
			out.println("<script>alert('修改失败');window.location.href='ShowAllcontactServlet'</script>");
		} 
		for(int i=0;i<contactList.size();i++){
			out.println(contactList.get(i).getCname()+"<br/>");
		}*/
		
		/*Contact测试
		Contact contact = new Contact("魏浩勋",1,"123456","654321","@qq.com","qq","天大","华南理工",2,"root");
		int cid = 2;
		IContactDao iContactDao = new ContactDaoImpl();
		int affectedRows=iContactDao.updataContactByCid(contact, cid, connection);
		
		if(affectedRows>0) {
			out.println("<script>alert('修改成功');window.location.href='ShowAllcontactServlet'</script>");
		}else {
			out.println("<script>alert('修改失败');window.location.href='ShowAllcontactServlet'</script>");
		}*/
		
		
		/*测试DAO层
		IGroupsDao iGroupsDao = new GroupsDaoImpl();
		ResultSet rs = iGroupsDao.SelectAllGroup(username, connection);
		while(rs.next()) {
			Group group = new Group();
			group.setGname(rs.getString("gname"));
			group.setUsername(rs.getString("username"));
			group.setGid(rs.getInt("gid"));
			
			groupList.add(group);
		}*/
	%>
</body>
</html>