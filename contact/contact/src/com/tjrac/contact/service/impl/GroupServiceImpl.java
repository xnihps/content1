package com.tjrac.contact.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tjrac.contact.dao.IGroupsDao;
import com.tjrac.contact.dao.impl.GroupsDaoImpl;
import com.tjrac.contact.pojo.Group;
import com.tjrac.contact.service.IGroupService;
import com.tjrac.contact.util.ConnectionManager;

public class GroupServiceImpl implements IGroupService {

	@Override
	public int addGroup(Group group) {
		// TODO Auto-generated method stub
		ConnectionManager connectionManager = new ConnectionManager();
		Connection connection = connectionManager.getConnection();
		
		IGroupsDao iGroupsDao = new GroupsDaoImpl();
		int affectedRows = -1;
		try {
			affectedRows = iGroupsDao.insertGroup(group, connection);
			return affectedRows;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return affectedRows;
		}finally {
			connectionManager.closeConnection(connection);
		}
	}

	@Override
	public List<Group> showAllGroup(String username) {
		// TODO Auto-generated method stub
		ConnectionManager connectionManager = new ConnectionManager();
		Connection connection = connectionManager.getConnection();
		
		IGroupsDao iGroupsDao = new GroupsDaoImpl();
		List<Group> groupList = new ArrayList<Group>();
		ResultSet rs;
		try {
			rs = iGroupsDao.SelectAllGroup(username, connection);
			while(rs.next()) {
				Group group = new Group();
				group.setGname(rs.getString("gname"));
				group.setUsername(rs.getString("username"));
				group.setGid(rs.getInt("gid"));
				
				groupList.add(group);
			}
			return groupList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			connectionManager.closeConnection(connection);
		}
	}
	

	@Override
	public int updataGroup(String gname, int gid) {
		// TODO Auto-generated method stub
		ConnectionManager connectionManager = new ConnectionManager();
		Connection connection = connectionManager.getConnection();
		
		IGroupsDao iGroupsDao = new GroupsDaoImpl();
		int affectedRows = -1;
		try {
			affectedRows = iGroupsDao.updataGroupByGid(gname, gid, connection);
			return affectedRows;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return affectedRows;
		}finally {
			connectionManager.closeConnection(connection);
		}
	}

	@Override
	public List<Group> showGroupByGname(String gname, String username) {
		// TODO Auto-generated method stub
		ConnectionManager connectionManager = new ConnectionManager();
		Connection connection = connectionManager.getConnection();
		
		IGroupsDao iGroupsDao = new GroupsDaoImpl();
		List<Group> groupList = new ArrayList<Group>();
		ResultSet rs;
		try {
			rs = iGroupsDao.SelectAllGroupByGname(gname, username, connection);
			while(rs.next()) {
				Group group = new Group();
				group.setGname(rs.getString("gname"));
				group.setUsername(rs.getString("username"));
				group.setGid(rs.getInt("gid"));
				
				groupList.add(group);
			}
			return groupList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			connectionManager.closeConnection(connection);
		}
	}

}
