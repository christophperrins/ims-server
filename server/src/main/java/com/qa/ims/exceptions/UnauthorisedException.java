package com.qa.ims.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

public class UnauthorisedException extends BaseException{

	private static final long serialVersionUID = 5924122132403068820L;

	public UnauthorisedException(String logMessage, String returnMessage) {
		super(logMessage, returnMessage, new HttpHeaders(), HttpStatus.UNAUTHORIZED);
	}
	
	public UnauthorisedException(String message) {
		super(message, new HttpHeaders(), HttpStatus.UNAUTHORIZED);
	}

}
