package com.tjrac.contact.service;

import java.util.List;

import com.tjrac.contact.pojo.Contact;

public interface IContactService {
	public abstract int addContact(final Contact contact);

	public abstract int deleteContact(final int cid);
	
	public abstract List<Contact> showAllContact(final String username);
	
	public abstract List<Contact> showAllContactByCname(final String cname);
	
	public abstract List<Contact> showAllContactByCsex(final String csex);
	
	public abstract Contact showAllContactByCid(final int cid);
	
	public abstract int updataContact(final Contact contact,final int cid);
}
