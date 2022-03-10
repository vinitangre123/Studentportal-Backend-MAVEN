package com.data.studentsportal.Service;

import java.util.List;

import com.data.studentsportal.Entity.Students;



public interface Studentservice {
	
	public Students SaveDetails(Students students);
	
	public List FindDetails();
	
	public List<?> sortdata(Integer id);
	
	public List<Students> sortname(String studentname);
	
	public int updatedata(String studentname,Integer id);
	
	public int deleterecord(Integer id);
	
	public List<?> FindStates();
	
	public List<?> FindDistrict();
	

}
