package com.data.studentsportal.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="studentsdetails")
@Entity
public class Students {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "studentname")
	private String studentname;
	
	@Column(name = "age")
	private Integer age;
	
	@Column(name = "place")
	private String place;
	
	@Column(name = "mobileno")
	private String mobileno;
	
	@Column(name = "colleagename")
	private String colleagename;
	
	@Column(name="gender")
	private String gender;
	
	
	
	@Column(name = "pincode")
	private Integer pincode;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "bankname")
	private String bankname;
	
	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getColleagename() {
		return colleagename;
	}

	public void setColleagename(String colleagename) {
		this.colleagename = colleagename;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", studentname=" + studentname + ", age=" + age + ", place=" + place
				+ ", mobileno=" + mobileno + ", colleagename=" + colleagename + ", gender=" + gender + ", pincode="
				+ pincode + ", city=" + city + ", bankname=" + bankname + "]";
	}

	
}
