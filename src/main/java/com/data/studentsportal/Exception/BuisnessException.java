package com.data.studentsportal.Exception;

import org.springframework.stereotype.Component;

@Component
public class BuisnessException extends RuntimeException {
	
	/**
	 * 
	 */
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
	
	
	public BuisnessException(String errorcode, String errormsg) {
		super();
		Errorcode = errorcode;
		Errormsg = errormsg;
	}
	public BuisnessException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BuisnessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	public BuisnessException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public BuisnessException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public BuisnessException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}
