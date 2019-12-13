package com.cpg.application.controller;

import java.util.List;
import java.util.Scanner;

import com.cpg.appication.bean.ContactBean;
import com.cpg.application.dao.ContactDAO;
import com.cpg.application.factory.ContactFactory;

public class AllContacts {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		ContactBean c=new ContactBean();
		ContactDAO dao=ContactFactory.getCustomerDAO();
		while(true) {
			System.out.println("press 1 to show all Contacts");
			System.out.println("press 2 to search for contacts");
			System.out.println("press 3 to operate contacts");

			int choice=sc.nextInt();
			switch(choice) {


			case 1:
				System.out.println("enter the Contact name");
				String name=sc.next();
				System.out.println("enter the contact number");
				int number=sc.nextInt();
				System.out.println("enter the groupname ");
				String groupname=sc.next();

				c.setName(name);
				c.setNumber(number);
				c.setGroup(groupname);


				boolean check=dao.addContact(c);
				if(check) {
					System.out.println("Contacts added");
				}else {
					System.err.println("contacts not added");
				}

				break;
			case 2:
				System.out.println("enter the Contact to be Searched");
				int id2=sc.nextInt();
				System.out.println("enter the Contact name");
				String name1=sc.next();
				System.out.println("enter the Contact number");
				int number1=sc.nextInt();
				System.out.println("enter groupname  ");
				String groupname1=sc.next();

				boolean check3=dao.editContact(id2);
				if(check3) {
					System.out.println("Contact Searched");
				}else {
					System.err.println("Contact not searched");
				}
				break;


			case 3:
				System.out.println("enter Contact number to be added");
				String name2=sc.next();
				boolean check1=dao.addContact(c );
				if(check1) {
					System.out.println("Contact added");
				}else {
					System.err.println("contact not Found ");
				
					
				System.out.println("enter Contact number to be deleted");
				int number3=sc.nextInt();
				boolean check2=dao.deleteContact(choice);
				if(check1) {
					System.out.println("Contact deleted");
				}else {
					System.err.println("contact not Found ");
				
					
				System.out.println("enter Contact number to be edited");
				int number2=sc.nextInt();
				boolean check5=dao.editContact(choice);
				if(check1) {
					System.out.println("Contact edited");
				}else {
					System.err.println("contact not Found ");
				}
				break;
				}
				}

			case 4:
				List<ContactBean> c1=dao.getAllContacts();
				if(c1!=null) {
					for(ContactBean cont: c1) {

					}
				}else {

					System.out.println("Contact not found");
				}
				break;

			default:
				break;

			}
		}
	


	
	}
}

