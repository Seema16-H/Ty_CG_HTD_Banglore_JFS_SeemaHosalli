package com.cpg.application.dao;

import java.util.ArrayList;
import java.util.List;

import com.cpg.appication.bean.ContactBean;

public class ContactDAOImpl implements ContactDAO {
	private List<ContactBean> contactbean=new ArrayList<ContactBean>();

	@Override
	public List<ContactBean> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addContact(ContactBean name) {
		for(ContactBean c1:contactbean) {
			
		}if(c1.getContactname==c1.getContactname())
		return c1;
	}

	@Override
	public boolean editContact(int id2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(int number) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
