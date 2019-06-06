package com.tjrac.contact.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;

import com.tjrac.contact.dao.IAccountDao;
import com.tjrac.contact.dao.impl.AccountDaoImpl;
import com.tjrac.contact.pojo.Account;
import com.tjrac.contact.service.IAccountService;
import com.tjrac.contact.util.ConnectionManager;

public class AccountServiceImpl implements IAccountService {

	@Override
	//添加账号
	public int addAccount(Account account) {
		// TODO Auto-generated method stub
		ConnectionManager connectionManager = new ConnectionManager();
		Connection connection = connectionManager.getConnection();
		
		IAccountDao iAccountDao = new AccountDaoImpl();
		int affectedRows = -1;
		try {
			affectedRows = iAccountDao.insertAccount(account, connection);
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
	//检查登录
	public int checkAccount(final String username,final String pwd){
		// TODO Auto-generated method stub
		ConnectionManager connectionManager = new ConnectionManager();
		Connection connection = connectionManager.getConnection();
		
		IAccountDao iAccountDao = new AccountDaoImpl();
		int affectedRows=-1;
		try {
			affectedRows = iAccountDao.login(username,pwd,connection);
			return affectedRows;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return affectedRows;
		}
	}

	@Override
	//更新密码
	public int updatePwd(String username, String newpwd) {
		// TODO Auto-generated method stub
		ConnectionManager connectionManager = new ConnectionManager();
		Connection connection = connectionManager.getConnection();
		
		IAccountDao iAccountDao = new AccountDaoImpl();
		int affectedRows = -1;
		try {
			affectedRows = iAccountDao.uppwdAccount(username, newpwd, connection);
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
	public int addnewAccount(String username) {
		ConnectionManager connectionManager = new ConnectionManager();
		Connection connection = connectionManager.getConnection();
		
		IAccountDao iAccountDao = new AccountDaoImpl();
		int affectedRows=-1;
		try {
			affectedRows = iAccountDao.rigister(username,connection);
			return affectedRows;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return affectedRows;
		}
	}

}
