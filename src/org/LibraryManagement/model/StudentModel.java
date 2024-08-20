package org.LibraryManagement.model;

import java.util.ArrayList;

public class StudentModel extends LibStorage {
	private int sid;
	private String name;
	private String email;
	private String contact;
	private ArrayList books;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public ArrayList getBooks() {
		return books;
	}
	public void setBooks(ArrayList books) {
		this.books = books;
	}
	

}
