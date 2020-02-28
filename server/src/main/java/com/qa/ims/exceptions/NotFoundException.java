package com.qa.ims.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

public class NotFoundException extends BaseException{

	private static final long serialVersionUID = 3727263992620016788L;

	public NotFoundException(String logMessage, String returnMessage) {
		super(logMessage, returnMessage, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}
	
	public NotFoundException(String message) {
		super(message, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}

	
}
