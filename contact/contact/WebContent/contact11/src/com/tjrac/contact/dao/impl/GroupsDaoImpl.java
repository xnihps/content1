package com.tjrac.contact.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;


import com.tjrac.contact.dao.IGroupsDao;
import com.tjrac.contact.pojo.Group;
import com.tjrac.contact.util.SQLManager;

public class GroupsDaoImpl implements IGroupsDao {

	@Override
	public int insertGroup(Group group, Connection connection) throws Exception {
		// TODO Auto-generated method stub
		SQLManager sqlManager = new SQLManager();
		String strSQL = "insert into groups(gname,username) value(?,?)";
		Object[] params = new Object[] { group.getGname(),group.getUsername() };
		int result = sqlManager.execUpdate(connection,strSQL,params);
		return result;
	}

	@Override
	public int deleteGroupByGid(int gid, Connection connection) throws Exception {
		// TODO Auto-generated method stub
		SQLManager sqlManager = new SQLManager();
		String strSQL = "delete from groups where gid=?";
		Object[] params = new Object[] { gid };
		int result = sqlManager.execUpdate(connection,strSQL,params);
		return result;
	}

	@Override
	public ResultSet SelectAllGroup(String username,Connection connection) throws Exception {
		// TODO Auto-generated method stub
		SQLManager sqlManager = new SQLManager();
		String strSQL = "select * from groups where username=?";
		Object[] params = new Object[] { username };
		ResultSet rs = sqlManager.execQuery(connection,strSQL,params);
		return rs;
	}

	@Override
	public int updataGroupByGid(String gname, int gid, Connection connection) throws Exception {
		// TODO Auto-generated method stub
		SQLManager sqlManager = new SQLManager();
		String strSQL = "update groups set gname=?  where gid=?";
		Object[] params = new Object[] { gname,gid };
		int result = sqlManager.execUpdate(connection,strSQL,params);
		return result;
	}

}
