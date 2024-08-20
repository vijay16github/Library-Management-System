package org.LibraryManagement.model;

public class LibStorage { 
	private int id;
	private String name;
	private String author;
	private String pub;
	private int price;
	private String category;

	
	public LibStorage()
	{
		
	}
	public LibStorage(int id,String name,String author,String pub,int price,String category)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.pub=pub;
		this.price=price;
		this.category=category;
		
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
