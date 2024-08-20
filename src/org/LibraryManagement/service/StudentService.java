package org.LibraryManagement.service;

import java.util.ArrayList;

import org.LibraryManagement.model.StudentModel;
import org.LibraryManagement.repository.StudentRepository;

public class StudentService {
	StudentRepository sRepo=new StudentRepository();
	
	public boolean isAddStudent(StudentModel sm)
	{
		boolean b=sRepo.isAddStudent(sm);
		return b;
	}
	public ArrayList getAllStudents()
	{
		ArrayList al=sRepo.getAllStudents();
		return al.size()>0?al:null;
	}

}
