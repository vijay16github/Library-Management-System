package org.LibraryManagement.service;

import java.util.ArrayList;

import org.LibraryManagement.model.LibStorage;
import org.LibraryManagement.repository.LibStorageRepo;

public class LibStorageService
{
	LibStorageRepo lbrepo=new LibStorageRepo();
	
	public boolean isAddbook(LibStorage lb)
	{
		boolean b=lbrepo.isAddbook(lb);
         return b;
	}
	public ArrayList getAllbooks()
	{
		ArrayList al=lbrepo.getAllbooks();
		return al.size()>0?al:null;
		
	}
}
