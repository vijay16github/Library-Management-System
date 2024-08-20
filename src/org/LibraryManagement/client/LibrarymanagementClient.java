package org.LibraryManagement.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.LibraryManagement.model.LibStorage;
import org.LibraryManagement.model.StudentModel;
import org.LibraryManagement.service.LibStorageService;
import org.LibraryManagement.service.StudentService;

public class LibrarymanagementClient {
  public static void main(String x[])
  {
	  StudentService ss=new StudentService();
	  LibStorageService lbservice=new LibStorageService();
	  LibStorage lb;
	  do
	  {
		  System.out.println("1:Add new books in collection");
		  System.out.println("2:view all books");
		  System.out.println("3:Count Category wise books");
		  System.out.println("4:Display Category wise books with info");
		  System.out.println("5:Display Author wise books");
		  System.out.println("6:Add New Students (sid, name, email, contact ,ArrayList<Book>)");
		  System.out.println("7:Display Students");
		  System.out.println("8:Issue Book to Student");
		  System.out.println("10:Delete book by author");
		  
		  Scanner xyz=new Scanner(System.in);
		  int choice=xyz.nextInt();
		  switch(choice)
		  {
		  case 1:
			  
			  System.out.println("Enter the book id and price");
			  int id=xyz.nextInt();
			  int price=xyz.nextInt();
			  xyz.nextLine();
			  System.out.println("Enter the book name,author name and publication");
			  String name=xyz.nextLine();
			  String author=xyz.nextLine();
			  String pub=xyz.nextLine();
			  System.out.println("Enter the category of book");
			  String category=xyz.nextLine();
			//  String status=xyz.nextLine();
			  lb=new LibStorage(id,name,author,pub,price,category);
			  
			  boolean b=lbservice.isAddbook(lb);
			  if(b)
			  {
				  System.out.println("book added successfully");
			  }
			  else
			  {				  
				  System.out.println("Some problem.........");
			  }
			  
			  break;
			  
		  case 2:
			  ArrayList al=lbservice.getAllbooks();
			  if(al!=null)
			  {
				  for(Object obj:al)
				  {
					  LibStorage lib=(LibStorage)obj;
					  System.out.println(lib.getId()+"\t"+lib.getName()+"\t"+lib.getAuthor()+"\t"+lib.getPub()+"\t"+lib.getPrice()+"\t"+lib.getCategory());
				  }
			  }
			  else
			  {
				  System.out.println("No Data present in collection");
			  }
			  
			  break;
		  case 3:
			  al=lbservice.getAllbooks();
			  int index=0;
			  for(Object obj:al)
			  {
				  lb=(LibStorage)obj;
				  String cat=lb.getCategory();
				  int count=0;
				  for(int i=index;i<al.size();i++)
				  {
					  Object obj1=al.get(i);
					  LibStorage libstorage1=(LibStorage )obj1;
					  if(libstorage1.getCategory().equals(cat))
					  {
						  count++;
					  }
				  }
				  boolean a=true;
				  for(int j=0;j<index;j++)
				  {
					  Object obj1=al.get(j);
					  LibStorage libstorage1=(LibStorage )obj1;
					  if(libstorage1.getCategory().equals(cat))
					  {
						  a=false;
						  break;
					  }
				  }
				  if(a)
				  {
					  System.out.println("Category: "+cat+"\tcount"+count);
				  }
				     index++;
				  
				  
				  
			  }
			  break;
	  case 4:
     		  ArrayList temp = new ArrayList();
     		  al=lbservice.getAllbooks();
     		  
     		  for(Object obj:al)
     		  {
     			  lb=(LibStorage)obj;
     			  String str=lb.getCategory();
     			  if(!temp.contains(str))
     			  {
     				  temp.add(str);
     			  }
     			  
     		  }
     		  for(Object obj:temp)
     		  {
     			  String str=(String)obj;
     			  System.out.println("Category---"+str);
     			  for(Object obj1:al)
     			  {
     				  lb=(LibStorage)obj1;
     				  if(lb.getCategory().equals(str))
     				  {
     					 System.out.println(lb.getId()+"\t"+lb.getName()+"\t"+lb.getAuthor()+"\t"+lb.getPub()+"\t"+lb.getPrice()+"\t"+lb.getCategory());
     				  }
     				  
     			  }
     		  }
     		  break;
     		  
		  
		  
		  case 5:
			  System.out.println("hii");
			  al=lbservice.getAllbooks();
			  int index1=0;
			  for(Object obj2:al)
			  {
				  
				  lb=(LibStorage)obj2;
				  String auth=lb.getAuthor();
				  System.out.println("alsize"+al.size());
				  for(int i=index1;i<al.size();i++)
				  {
					  
					 Object obj3 =al.get(i);
					 LibStorage libstorage1=(LibStorage )obj2;
					 if(libstorage1.getAuthor().equals(auth))
					  {
						  
						 LibStorage lib=(LibStorage)obj2;
						 System.out.println(lib.getAuthor()+"\t"+lib.getId()+"\t"+lib.getName()+"\t"+lib.getPub()+"\t"+lib.getPrice()+"\t"+lib.getCategory());
						 break;
						  
					  }
					 else
					  {
						  System.out.println("No Data present in collection");
					  }
					  
				
					 
					 
				  }
			  }
			  break;
			  
		  case 6:
			// xyz.nextLine();
			  StudentModel smodel=new StudentModel();
			  System.out.println("Enter the student id and name");
			  int sid=xyz.nextInt();
			  xyz.nextLine();
			  String sname=xyz.nextLine();
			  System.out.println("Enter the email and contacts");
			  String email=xyz.nextLine();
			  String contact=xyz.nextLine();
			  smodel.setSid(sid);
			  smodel.setName(sname);
			  smodel.setEmail(email);
			  smodel.setContact(contact);
			 
			  b=ss.isAddStudent(smodel);
			  if(b)
			  {
				  System.out.println("Student added Successfully");
			  }
			  else
			  {
				  System.out.println("student not added");
			  }
			  break;
		  case 7:
			  al=ss.getAllStudents();
			  if(al!=null)
			  {
				  for(Object obj:al)
				  {
					  StudentModel sm=(StudentModel)obj;
					  System.out.println(sm.getSid()+"\t"+sm.getName()+"\t"+sm.getEmail()+"\t"+sm.getContact()+"\t"+sm.getBooks());
					  
				  }
				  
			  }
			  else
			  {
				  System.out.println("NO Student data is present");
			  }
			  break;
		  case 10:
			  al=lbservice.getAllbooks();
			  xyz.nextLine();
			  Iterator it=al.iterator();
			  System.out.println("enter the author");
			  String st=xyz.nextLine();
			  while(it.hasNext())
			  {
				  Object obj=it.next();
				  lb=(LibStorage)obj;
				  if(lb.getAuthor().equals(st))
				  {
					  it.remove();
				  }
			  }
			  break;
			  
			  
			default:
				System.out.println("wrong choice");
		  }
		  
		
	  }while(true);
	  
	  
  }
}
