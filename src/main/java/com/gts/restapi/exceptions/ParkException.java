package com.gts.restapi.exceptions;

import com.gts.restapi.enums.ExceptionEnum;

public class ParkException extends Exception{
	
	private static final long serialVersionUID = 1L;

	private ExceptionEnum exceptionCode;
	private String message;
	
	public ParkException(String message, ExceptionEnum exceptionCode) {
		super();
		this.message = message;
		this.exceptionCode = exceptionCode;
	}
	
	public ExceptionEnum getExceptionCode() {
		return exceptionCode;
	}

	public String getMessage() {
		return message;
	}
}
