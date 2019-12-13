package com.cpg.application.services;

import java.util.List;

public interface ContactServices {

	public List<ContactServices> getAllUsers();
	   public ContactServices userlogin(String username,String password);
	   public boolean updateUser(int usersid, String password, String email);
	   public boolean DeleteUser(int usersid, String password);
	   public boolean InsertUser(ContactServices user);
	   public boolean DeleteUser(ContactServices user);

	}

