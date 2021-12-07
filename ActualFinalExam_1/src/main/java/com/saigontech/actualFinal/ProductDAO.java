package com.saigontech.actualFinal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public interface ProductDAO {
	@Autowired
	public List<Products> getProductsList();

	
	
//	public void addStudent(Student student);
//		
//	public Student getStudent(int Id);
//	
//	public Student updateStudent(Student student);
}
