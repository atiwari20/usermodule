package com.abhi.exception;

public class ApplicationException extends Exception {
	private String exceptionMessage;

	public ApplicationException(String err, java.io.InputStream e) {
		// TODO Auto-generated constructor stub
	}

	public ApplicationException() {

		super();
	}

	public ApplicationException(String error) {

		super(error);
		this.exceptionMessage = error;
	}

	
	public ApplicationException (Throwable thro , String error) {
		
		this.exceptionMessage=error;
		this.initCause(thro);
	}
	
}
