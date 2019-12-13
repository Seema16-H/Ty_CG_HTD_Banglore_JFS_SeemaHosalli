package com.cpg.application.factory;

import com.cpg.application.dao.ContactDAO;
import com.cpg.application.dao.ContactDAOImpl;

public class ContactFactory {

	
public static ContactDAO getCustomerDAO() {
		
		return new ContactDAOImpl();
	}
}
