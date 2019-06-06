package com.tjrac.contact.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;

import com.tjrac.contact.dao.IAccountDao;
import com.tjrac.contact.pojo.Account;
import com.tjrac.contact.util.SQLManager;

public class AccountDaoImpl implements IAccountDao {

	@Override
	public int insertAccount(final Account account,final Connection connection) throws Exception {
		// TODO Auto-generated method stub
		SQLManager sqlManager = new SQLManager();
		String strSQL = "insert into account(username,pwd) value(?,?)";
		Object[] params = new Object[] { account.getUsername(),account.getPwd() };
		int result = sqlManager.execUpdate(connection,strSQL,params);
		return result;
	}

	@Override
	public int login(final String username,final String pwd, Connection connection) throws Exception {
		// TODO Auto-generated method stub
		SQLManager sqlManager = new SQLManager();
		String strSQL = "select * from account where username=? and pwd=?";
		Object[] params = new Object[] { username,pwd };
		ResultSet rs = sqlManager.execQuery(connection,strSQL,params);
		int a= -1;
		if(rs.next()){
			return a = 1;
		}else{
			return a = 0;
		}
	}

	@Override
	public int uppwdAccount(String username, String newpwd, Connection connection) throws Exception {
		// TODO Auto-generated method stub
		SQLManager sqlManager = new SQLManager();
		String strSQL = "update account set pwd=? where username=?";
		Object[] params = new Object[] { newpwd,username };
		int result = sqlManager.execUpdate(connection,strSQL,params);
		return result;
	}

	@Override
	public int rigister(String username, Connection connection) throws Exception {
		// TODO Auto-generated method stub
		SQLManager sqlManager = new SQLManager();
		String strSQL = "select * from account where username=?";
		Object[] params = new Object[] { username};
		ResultSet rs = sqlManager.execQuery(connection,strSQL,params);
		int a= -1;
		if(rs.next()){
			return a = 1;
		}else{
			return a;
		}
	}
}
