package com.tjrac.contact.pojo;

public class Contact {
	private String cname;
	private String csex;
	private String mphone;
	private String tel;
	private String email;
	private String qq;
	private String dept;
	private String address;
	private int gid;
	private String username;
	private	int cid;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCsex() {
		return csex;
	}
	public void setCsex(String csex) {
		this.csex = csex;
	}
	public String getMphone() {
		return mphone;
	}
	public void setMphone(String mphone) {
		this.mphone = mphone;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Contact(String cname, String csex, String mphone, String tel, String email, String qq, String dept,
			String address) {
		super();
		this.cname = cname;
		this.csex = csex;
		this.mphone = mphone;
		this.tel = tel;
		this.email = email;
		this.qq = qq;
		this.dept = dept;
		this.address = address;
	}
	
	public Contact(String cname, String csex, String mphone, String tel, String email, String qq, String dept,
			String address, int gid) {
		super();
		this.cname = cname;
		this.csex = csex;
		this.mphone = mphone;
		this.tel = tel;
		this.email = email;
		this.qq = qq;
		this.dept = dept;
		this.address = address;
		this.gid = gid;
	}
	
	public Contact(String cname, String csex, String mphone, String tel, String email, String qq, String dept,
			String address, int gid, String username) {
		super();
		this.cname = cname;
		this.csex = csex;
		this.mphone = mphone;
		this.tel = tel;
		this.email = email;
		this.qq = qq;
		this.dept = dept;
		this.address = address;
		this.gid = gid;
		this.username = username;
	}
	
	public Contact(String cname, String csex, String mphone, String tel, String email, String qq, String dept,
			String address, int gid, String username, int cid) {
		super();
		this.cname = cname;
		this.csex = csex;
		this.mphone = mphone;
		this.tel = tel;
		this.email = email;
		this.qq = qq;
		this.dept = dept;
		this.address = address;
		this.gid = gid;
		this.username = username;
		this.cid = cid;
	}
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	
	public String toString() {
		return "Contact [cname=" + cname + ", csex=" + csex + ", mphone=" + mphone + ", tel=" + tel + ", email=" + email
				+ ", qq=" + qq + ", dept=" + dept + ", address=" + address + ", gid=" + gid + ", username=" + username
				+ ", cid=" + cid + "]";
	}
	
	
}
