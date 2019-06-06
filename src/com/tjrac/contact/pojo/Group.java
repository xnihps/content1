package com.tjrac.contact.pojo;

public class Group {
	private String gname;
	private String username;
	private int gid;
	
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	
	
	
	public Group(String gname, String username) {
		super();
		this.gname = gname;
		this.username = username;
	}
	
	public Group(String gname, String username, int gid) {
		super();
		this.gname = gname;
		this.username = username;
		this.gid = gid;
	}
	
	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Group [gname=" + gname + ", username=" + username + ", gid=" + gid + "]";
	}
	
	
	
}
