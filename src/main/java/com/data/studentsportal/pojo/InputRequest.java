package com.data.studentsportal.pojo;

public class InputRequest {
	
	
	private Integer id;
	private String studentname;
	private Integer age;
	
	private String bankname;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	@Override
	public String toString() {
		return "InputRequest [id=" + id + ", studentname=" + studentname + ", age=" + age + ", bankname=" + bankname
				+ "]";
	}
	
	
	
	

}
