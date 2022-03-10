package com.data.studentsportal.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.data.studentsportal.Entity.States;
import com.data.studentsportal.Entity.Students;
import com.data.studentsportal.Exception.BuisnessException;
import com.data.studentsportal.Repo.DistrictRepo;
import com.data.studentsportal.Repo.StatesRepo;
import com.data.studentsportal.Repo.StudentsRepo;
import com.data.studentsportal.Service.Studentservice;



@Service
@Component
public class StudentServiceImpl implements Studentservice {

	@Autowired
	StudentsRepo studentrepo;
    
	@Autowired
	StatesRepo staesrepo;
	
	@Autowired
	DistrictRepo distrepo;
	
	
	
	@Override
	public Students SaveDetails(Students students) {

		// List list1= (List) studentrepo.save(students);

		if (students.getStudentname().isEmpty() || students.getStudentname().length() == 0) {
			throw new BuisnessException("601", "please send proper name Its blank");
		} else if(students.getStudentname().contains("1"))
		{
			throw new BuisnessException("602","student name doesnot allowed no");
		}
		else {
			try {

				{
					Students stu = studentrepo.save(students);
					return stu;
				}
			} catch (IllegalArgumentException e) {
				throw new BuisnessException("603", "given studentsdata is null" + e.getMessage());
			} catch (Exception e) {
				// TODO: handle exception
				throw new BuisnessException("603", "something went wrong in service layer" + e.getMessage());
			}
		}

	}

	@Override
	public List FindDetails() {
		// TODO Auto-generated method stub
		Students stu = new Students();

		stu.toString();

		return studentrepo.findAll();

	}

	@Override
	public List<?> sortdata(Integer id) {
		// TODO Auto-generated method stub
		return studentrepo.FindBySortdata(id);
	}

	@Override
	public List<Students> sortname(String studentname) {
		// TODO Auto-generated method stub
		return studentrepo.FindBySortname(studentname);
	}

	@Override
	@Transactional
	public int updatedata(String studentname, Integer id) {
		int a = studentrepo.Updatedata(studentname, id);
		return a;
	}

	@Override
	public int deleterecord(Integer id) {

		int b = studentrepo.deletedata(id);
		return b;

	}

	@Override
	public List<?> FindStates() {
		// TODO Auto-generated method stub
		States sta = new States(); 
		sta.toString();

		return staesrepo.findAll();

	}
	@Override
	public List<?> FindDistrict() {
		// TODO Auto-generated method stub
		States sta = new States(); 
		sta.toString();

		return distrepo.findAll();

	}

	
	
	
	
}
