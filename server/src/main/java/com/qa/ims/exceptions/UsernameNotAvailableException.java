package com.qa.ims.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

public class UsernameNotAvailableException extends BaseException{

	private static final long serialVersionUID = 3727263992620016788L;

	public UsernameNotAvailableException(String logMessage, String returnMessage) {
		super(logMessage, returnMessage, new HttpHeaders(), HttpStatus.CONFLICT);
	}

	public UsernameNotAvailableException(String message) {
		super(message, new HttpHeaders(), HttpStatus.CONFLICT);
	}	
}
