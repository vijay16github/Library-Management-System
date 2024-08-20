package org.LibraryManagement.repository;

import java.util.*;

import org.LibraryManagement.model.LibStorage;

public class LibStorageRepo {
	static ArrayList al=new ArrayList();
	
	public int getCount()
	{
		return al.size();
	}
	public boolean isAddbook(LibStorage lb)
	{
		boolean b=al.add(lb);
		return b;
	}
	public ArrayList getAllbooks()
	{
		return al;
	}

}
