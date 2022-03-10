package com.data.studentsportal.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="all_cities")
@Entity
public class District {


	@Id
	@Column(name = "city_name")
	private String  city_name;
	
	@Column(name = "city_code")
	private String  city_code;
	
	@Column(name = "state_code")
	private String  state_code;

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public String getCity_code() {
		return city_code;
	}

	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}

	public String getState_code() {
		return state_code;
	}

	public void setState_code(String state_code) {
		this.state_code = state_code;
	}

	@Override
	public String toString() {
		return "District [city_name=" + city_name + ", city_code=" + city_code + ", state_code=" + state_code + "]";
	}
	
	
	
}
