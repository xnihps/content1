package com.tjrac.contact.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tjrac.contact.dao.IContactDao;
import com.tjrac.contact.dao.impl.ContactDaoImpl;
import com.tjrac.contact.pojo.Contact;
import com.tjrac.contact.service.IContactService;
import com.tjrac.contact.util.ConnectionManager;

public class ContactServiceImpl implements IContactService {

	@Override
	public int addContact(Contact contact) {
		// TODO Auto-generated method stub
		ConnectionManager connectionManager = new ConnectionManager();
		Connection connection = connectionManager.getConnection();
		
		IContactDao iContactDao =new ContactDaoImpl();
		int affectedRows = -1;
		try {
			affectedRows = iContactDao.insertContact(contact, connection);
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
	public int deleteContact(int cid) {
		// TODO Auto-generated method stub
		ConnectionManager connectionManager = new ConnectionManager();
		Connection connection = connectionManager.getConnection();
		
		IContactDao iContactDao =new ContactDaoImpl();
		int affectedRows = -1;
		try {
			affectedRows = iContactDao.deleteContactByCid(cid, connection);
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
	public List<Contact> showAllContact(String username) {
		// TODO Auto-generated method stub
		ConnectionManager connectionManager = new ConnectionManager();
		Connection connection = connectionManager.getConnection();
		
		IContactDao iContactDao = new ContactDaoImpl();
		List<Contact> contactList = new ArrayList<Contact>();
		ResultSet rs;
		try {
			rs = iContactDao.SelectAllContact(username, connection);
			while(rs.next()) {
				Contact contact = new Contact();
				contact.setCname(rs.getString("cname"));
				contact.setCsex(rs.getString("csex"));
				contact.setMphone(rs.getString("mphone"));
				contact.setTel(rs.getString("tel"));
				contact.setEmail(rs.getString("email"));
				contact.setQq(rs.getString("qq"));
				contact.setDept(rs.getString("dept"));
				contact.setAddress(rs.getString("address"));
				contact.setGid(rs.getInt("gid"));
				contact.setUsername(rs.getString("username"));
				contact.setCid(rs.getInt("cid"));
				
				
				contactList.add(contact);
			}
			return contactList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			connectionManager.closeConnection(connection);
		}
	}

	@Override
	public int updataContact(Contact contact, int cid) {
		// TODO Auto-generated method stub
		ConnectionManager connectionManager = new ConnectionManager();
		Connection connection = connectionManager.getConnection();
		
		IContactDao iContactDao =new ContactDaoImpl();
		int affectedRows = -1;
		try {
			affectedRows = iContactDao.updataContactByCid(contact, cid, connection);
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
	public List<Contact> showAllContactByCname(String cname) {
		// TODO Auto-generated method stub
		ConnectionManager connectionManager = new ConnectionManager();
		Connection connection = connectionManager.getConnection();
		
		IContactDao iContactDao = new ContactDaoImpl();
		List<Contact> contactList = new ArrayList<Contact>();
		ResultSet rs;
		try {
			rs = iContactDao.SelectContactByCname(cname, connection);
			while(rs.next()) {
				Contact contact = new Contact();
				contact.setCname(rs.getString("cname"));
				contact.setCsex(rs.getString("csex"));
				contact.setMphone(rs.getString("mphone"));
				contact.setTel(rs.getString("tel"));
				contact.setEmail(rs.getString("email"));
				contact.setQq(rs.getString("qq"));
				contact.setDept(rs.getString("dept"));
				contact.setAddress(rs.getString("address"));
				contact.setGid(rs.getInt("gid"));
				contact.setUsername(rs.getString("username"));
				contact.setCid(rs.getInt("cid"));
				
				
				contactList.add(contact);
			}
			return contactList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			connectionManager.closeConnection(connection);
		}
	}

	@Override
	public List<Contact> showAllContactByCsex(String csex) {
		// TODO Auto-generated method stub
		ConnectionManager connectionManager = new ConnectionManager();
		Connection connection = connectionManager.getConnection();
		
		IContactDao iContactDao = new ContactDaoImpl();
		List<Contact> contactList = new ArrayList<Contact>();
		ResultSet rs;
		try {
			rs = iContactDao.SelectContactByCsex(csex, connection);
			while(rs.next()) {
				Contact contact = new Contact();
				contact.setCname(rs.getString("cname"));
				contact.setCsex(rs.getString("csex"));
				contact.setMphone(rs.getString("mphone"));
				contact.setTel(rs.getString("tel"));
				contact.setEmail(rs.getString("email"));
				contact.setQq(rs.getString("qq"));
				contact.setDept(rs.getString("dept"));
				contact.setAddress(rs.getString("address"));
				contact.setGid(rs.getInt("gid"));
				contact.setUsername(rs.getString("username"));
				contact.setCid(rs.getInt("cid"));
				
				
				contactList.add(contact);
			}
			return contactList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			connectionManager.closeConnection(connection);
		}
	}

	@Override
	public Contact showAllContactByCid(int cid) {
		// TODO Auto-generated method stub
		ConnectionManager connectionManager = new ConnectionManager();
		Connection connection = connectionManager.getConnection();
		
		IContactDao iContactDao = new ContactDaoImpl();
		ResultSet rs ;
		try {
			rs = iContactDao.SelectContactByCid(cid, connection);
			Contact contact = new Contact();
			while(rs.next()) {
				contact.setCname(rs.getString("cname"));
				contact.setCsex(rs.getString("csex"));
				contact.setMphone(rs.getString("mphone"));
				contact.setTel(rs.getString("tel"));
				contact.setEmail(rs.getString("email"));
				contact.setQq(rs.getString("qq"));
				contact.setDept(rs.getString("dept"));
				contact.setAddress(rs.getString("address"));
				contact.setGid(rs.getInt("gid"));
				contact.setUsername(rs.getString("username"));
				contact.setCid(rs.getInt("cid"));
			}
			return contact;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			connectionManager.closeConnection(connection);
		}
	}

}
