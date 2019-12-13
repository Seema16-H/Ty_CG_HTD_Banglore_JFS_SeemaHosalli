package com.cpg.application.dao;

import java.util.List;

import com.cpg.appication.bean.ContactBean;

public interface ContactDAO {
 public  List<ContactBean> getAllContacts();
 public boolean  addContact(ContactBean c);
 public boolean  editContact(int id2);
public boolean deleteContact(int number);



 
 
}
