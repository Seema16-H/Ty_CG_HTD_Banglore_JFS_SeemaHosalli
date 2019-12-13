package com.cpg.appication.bean;

public class ContactBean {

	public String name;
	public int number;
	public String group;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", number=" + number + ", group=" + group + "]";
	}
	
	
	
	
	
}
