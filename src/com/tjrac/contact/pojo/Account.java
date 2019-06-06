package com.tjrac.contact.pojo;

public class Account {
	private String username;
	private	String pwd;
	private int userid;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	public Account(String username, String pwd, int userid) {
		super();
		this.username = username;
		this.pwd = pwd;
		this.userid = userid;
	}
	
	public Account(String username, String pwd) {
		super();
		this.username = username;
		this.pwd = pwd;
	}
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	
	public String toString() {
		return "Account [username=" + username + ", pwd=" + pwd + ", userid=" + userid + "]";
	}
	
	
	
}
