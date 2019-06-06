package com.tjrac.contact.dao;

import java.sql.Connection;
import java.sql.ResultSet;

import com.tjrac.contact.pojo.Contact;

public interface IContactDao {
	public abstract int insertContact(final Contact contact,final Connection connection)throws Exception;

	public abstract int deleteContactByCid(final int cid,final Connection connection)throws Exception;
	
	public abstract ResultSet SelectAllContact(final String username,final Connection connection)throws Exception;
	
	public abstract int updataContactByCid(final Contact contact,final int cid,final Connection connection)throws Exception;
}
