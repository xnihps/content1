package com.tjrac.contact.dao;

import java.sql.Connection;

import com.tjrac.contact.pojo.Account;

public interface IAccountDao {
	public abstract int insertAccount(final Account account,final Connection connection)throws Exception;
	
	public abstract int login(final String username,final String pwd,final Connection connection)throws Exception;
	
	public abstract int uppwdAccount(final String username,final String newpwd,final Connection connection)throws Exception;
	
	public abstract int rigister(final String username,final Connection connection)throws Exception;
}
