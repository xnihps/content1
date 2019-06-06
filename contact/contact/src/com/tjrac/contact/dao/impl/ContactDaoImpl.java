package com.tjrac.contact.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;



import com.tjrac.contact.dao.IContactDao;
import com.tjrac.contact.pojo.Contact;
import com.tjrac.contact.util.SQLManager;

public class ContactDaoImpl implements IContactDao {

	@Override
	public int insertContact(Contact contact, Connection connection) throws Exception {
		// TODO Auto-generated method stub
		SQLManager sqlManager = new SQLManager();
		String strSQL = "insert into contact(cname,csex,mphone,tel,email,qq,dept,address,gid,username) value(?,?,?,?,?,?,?,?,?,?);";
		Object[] params = new Object[] { contact.getCname(),contact.getCsex(),contact.getMphone(),
						contact.getTel(),contact.getEmail(),contact.getQq(),contact.getDept(),
						contact.getAddress(),contact.getGid(),contact.getUsername()};
		int result = sqlManager.execUpdate(connection,strSQL,params);
		return result;
	}

	@Override
	public int deleteContactByCid(int cid, Connection connection) throws Exception {
		// TODO Auto-generated method stub
		SQLManager sqlManager = new SQLManager();
		String strSQL = "delete from contact where cid=?";
		Object[] params = new Object[] { cid };
		int result = sqlManager.execUpdate(connection,strSQL,params);
		return result;
	}

	@Override
	public ResultSet SelectAllContact(String username, Connection connection) throws Exception {
		// TODO Auto-generated method stub
		SQLManager sqlManager = new SQLManager();
		String strSQL = "select * from contact where username=?";
		Object[] params = new Object[] { username };
		ResultSet rs = sqlManager.execQuery(connection,strSQL,params);
		return rs;
	}

	@Override
	public int updataContactByCid(Contact contact,int cid, Connection connection) throws Exception {
		// TODO Auto-generated method stub
		SQLManager sqlManager = new SQLManager();
		String strSQL = "update contact set cname=?,csex=?,mphone=?,tel=?,email=?,qq=?,dept=?,address=?  where cid=?";
		Object[] params = new Object[] { contact.getCname(),contact.getCsex(),contact.getMphone(),
				contact.getTel(),contact.getEmail(),contact.getQq(),contact.getDept(),
				contact.getAddress(),cid };
		int result = sqlManager.execUpdate(connection,strSQL,params);
		return result;
	}

	@Override
	public ResultSet SelectContactByCname(String cname,Connection connection) throws Exception {
		// TODO Auto-generated method stub
		String strSQL = "select * from contact where cname like ? ";
		java.sql.PreparedStatement pstmt=null;
		pstmt =  connection.prepareStatement(strSQL);
		pstmt.setString(1,"%"+cname+"%");
		ResultSet rs = pstmt.executeQuery();
		
		return rs;
		//rs.close();pstmt.close();
	}

	@Override
	public ResultSet SelectContactByCsex(String csex,Connection connection) throws Exception {
		// TODO Auto-generated method stub
		SQLManager sqlManager = new SQLManager();
		String strSQL = "select * from contact where csex=?";
		Object[] params = new Object[] { csex };
		ResultSet rs = sqlManager.execQuery(connection,strSQL,params);
		return rs;
	}

	@Override
	public ResultSet SelectContactByCid(int cid, Connection connection) throws Exception {
		// TODO Auto-generated method stub
		SQLManager sqlManager = new SQLManager();
		String strSQL = "select * from contact where cid=?";
		Object[] params = new Object[] { cid };
		ResultSet rs = sqlManager.execQuery(connection,strSQL,params);
		return rs;
	}

}
