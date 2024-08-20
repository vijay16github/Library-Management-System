package org.LibraryManagement.repository;

import java.util.ArrayList;

import org.LibraryManagement.model.LibStorage;
import org.LibraryManagement.model.StudentModel;

public class StudentRepository {
	static ArrayList al=new ArrayList();
	public boolean isAddStudent(StudentModel sm)
	{
		boolean b=al.add(sm);
		return b;
	}
	public ArrayList getAllStudents()
	{
		return al;
	}
	public boolean issuebook(LibStorage lb, StudentModel sm)
	{
          int bookid = lb.getId();
          int studentid=sm.getSid();
          if(bookid!=null && studentid!=null)
          {
        	  
          }
	}
	

}
