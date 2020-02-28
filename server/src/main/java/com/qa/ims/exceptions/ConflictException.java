package com.qa.ims.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

public class ConflictException extends BaseException{

	private static final long serialVersionUID = 7475333682219549448L;

	public ConflictException(String message) {
		super(message, new HttpHeaders(), HttpStatus.CONFLICT);
	}

	public ConflictException(String logMessage, String returnMessage) {
		super(logMessage, returnMessage, new HttpHeaders(), HttpStatus.CONFLICT);
	}

	
	
}
