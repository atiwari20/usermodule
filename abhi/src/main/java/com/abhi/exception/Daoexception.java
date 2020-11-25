package com.abhi.exception;

import java.time.LocalDate;

import org.omg.CORBA.portable.InputStream;

public class Daoexception extends ApplicationException {

	String messageexception;

	public Daoexception() {
		super();

	}

	public Daoexception(String mesaage) {
		super(mesaage);
		this.messageexception = mesaage;
	}

	public Daoexception(Throwable thro, String message) {
		super(thro, message);

	}
}
