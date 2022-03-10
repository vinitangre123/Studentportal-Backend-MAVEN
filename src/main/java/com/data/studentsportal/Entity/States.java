package com.data.studentsportal.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="all_states")
@Entity
public class States {
	
	@Id
	@Column(name = "state_code")
	private String  state_code;
	
	@Column(name = "state_name")
	private String  state_name;
	
	public String getState_code() {
		return state_code;
	}
	public void setState_code(String state_code) {
		this.state_code = state_code;
	}
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	@Override
	public String toString() {
		return "States [state_code=" + state_code + ", state_name=" + state_name + "]";
	}
}
