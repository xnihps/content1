package com.tjrac.contact.dao;

import java.sql.Connection;
import java.sql.ResultSet;

import com.tjrac.contact.pojo.Group;

public interface IGroupsDao {
	public abstract int insertGroup(final Group group,final Connection connection)throws Exception;

	public abstract int deleteGroupByGid(final int gid,final Connection connection)throws Exception;
	
	public abstract ResultSet SelectAllGroup(final String username,final Connection connection)throws Exception;
	
	public abstract int updataGroupByGid(final String gname,final int gid,final Connection connection)throws Exception;
}
