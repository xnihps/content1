package com.tjrac.contact.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionManager {
	public Connection getConnection(){
		try {
				Context ctx = new InitialContext();
				DataSource ds = (DataSource)ctx.lookup("java:/comp/env/jdbc/phonebook");
				Connection connection =  ds.getConnection();
				return connection;
			}
		catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public void closeConnection(final Connection connection) {
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
