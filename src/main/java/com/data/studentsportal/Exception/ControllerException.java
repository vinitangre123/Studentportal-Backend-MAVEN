package com.data.studentsportal.Exception;

import org.springframework.stereotype.Component;

@Component
public class ControllerException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	private String Errorcode;
	private String Errormsg;
	
	
	public String getErrorcode() {
		return Errorcode;
	}
	public void setErrorcode(String errorcode) {
		Errorcode = errorcode;
	}
	public String getErrormsg() {
		return Errormsg;
	}
	public void setErrormsg(String errormsg) {
		Errormsg = errormsg;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public ControllerException(String errorcode, String errormsg) {
		super();
		Errorcode = errorcode;
		Errormsg = errormsg;
	}
	public ControllerException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
