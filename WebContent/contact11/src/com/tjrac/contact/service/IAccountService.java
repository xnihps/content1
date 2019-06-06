package com.tjrac.contact.service;


import com.tjrac.contact.pojo.Account;

public interface IAccountService {
	public abstract int addAccount(final Account account);
	
	public abstract int checkAccount(final String username,final String pwd);
	
	public abstract int updatePwd(final String username,final String newpwd);
	
	public abstract int addnewAccount(final String username);

}
