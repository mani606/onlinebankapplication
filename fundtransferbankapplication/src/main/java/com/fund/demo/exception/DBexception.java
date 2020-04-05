package com.fund.demo.exception;

public class DBexception extends Exception{

	
	private String message;
	private Exception ex;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Exception getEx() {
		return ex;
	}
	public void setEx(Exception ex) {
		this.ex = ex;
	}
	
}
