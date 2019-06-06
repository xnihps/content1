package com.tjrac.contact.service;

import java.util.List;

import com.tjrac.contact.pojo.Group;

public interface IGroupService {
	public abstract int addGroup(final Group group);

	//public abstract int deleteGroupByGid(final int gid);
	
	public abstract List<Group> showAllGroup(final String username);
	
	public abstract int updataGroup(final String gname,final int gid);
}
