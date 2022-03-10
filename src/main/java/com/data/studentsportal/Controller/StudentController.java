package com.data.studentsportal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.data.studentsportal.Entity.Students;
import com.data.studentsportal.Exception.BuisnessException;
import com.data.studentsportal.Exception.ControllerException;
import com.data.studentsportal.ServiceImpl.StudentServiceImpl;
import com.data.studentsportal.pojo.InputRequest;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentServiceImpl studentsserviceimpl;

	@GetMapping("/getdata")
	public ResponseEntity<?> Adduser() {

		try {
			System.out.println("hello controller");

			List<?> list = studentsserviceimpl.FindDetails();
			return new ResponseEntity<>(list, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>("Error Occured" + e, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PostMapping("/savedata")
	public ResponseEntity<?>savedata(@RequestBody Students student) {
	
		
	
		try
	    {

	    	Students st1=studentsserviceimpl.SaveDetails(student);
	    	return new ResponseEntity<Students>(st1, HttpStatus.CREATED);
	    }catch (BuisnessException e) {
			// TODO: handle exception
	    	ControllerException ce=new ControllerException(e.getErrorcode(),e.getErrormsg());
	    	return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
			
		}
		
	}

	@GetMapping("/sortdata/{id}")
	public ResponseEntity<?> Sortuser(@PathVariable Integer id) {

		try {
			System.out.println("hello controller");

			System.out.println(id);
			List<?> list1 = studentsserviceimpl.sortdata(id);
			// List<Students> list1 = studentsserviceimpl.sortdata(id);
			System.out.println("list" + list1);
			if (list1.isEmpty()) {
				return new ResponseEntity<>("id is not found" + id, HttpStatus.INTERNAL_SERVER_ERROR);
			} else {
				return new ResponseEntity<>(list1, HttpStatus.OK);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(e, HttpStatus.OK);
		}

	}

	@GetMapping("/sortname")
	public List<Students> Sortbyname(@RequestBody InputRequest input) {
		System.out.println("hello controller");

		List<Students> list1 = studentsserviceimpl.sortname(input.getStudentname());

		return list1;
	}

	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json", produces = "application/json", value = "/update")
	public ResponseEntity<?> updatedata(@RequestBody InputRequest input) {
		try {
			System.out.println("updateCalling--->");
			System.out.println("studentname:" + input.getStudentname());
			System.out.println("id:" + input.getId());
			if (input.getStudentname() == null || input.getId() == null) {
				return new ResponseEntity<>("Null", HttpStatus.INTERNAL_SERVER_ERROR);
			} else {
				int s = studentsserviceimpl.updatedata(input.getStudentname(), input.getId());
				System.out.println("updated succefully!!");
				return new ResponseEntity<>("updated succesfully", HttpStatus.OK);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("character is not allowd", HttpStatus.BAD_REQUEST);

		}

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> Deletedata(@PathVariable Integer id) {
		try {
			System.out.println("delete method Calling--->");

			System.out.println("id:"+ id);

			if (id == null) {
				return new ResponseEntity<>("id is null", HttpStatus.OK);
			} else {
				int delete = studentsserviceimpl.deleterecord(id);
				System.out.println("deleted  succefully!!");
				return new ResponseEntity<>("deleted succesfully", HttpStatus.OK);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@GetMapping("/state")
	public ResponseEntity<?> getState() {
		try {
			System.out.println("hello Sta");

			List<?> list = studentsserviceimpl.FindStates();
			System.out.println("stateslist"+list);
			return new ResponseEntity<>(list, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>("Error Occured" + e, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	@GetMapping("/district")
	public ResponseEntity<?> getdistrict() {
		try {
			System.out.println("hello Sta");

			List<?> list = studentsserviceimpl.FindDistrict();
			System.out.println("stateslist"+list);
			return new ResponseEntity<>(list, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>("Error Occured" + e, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	

}
