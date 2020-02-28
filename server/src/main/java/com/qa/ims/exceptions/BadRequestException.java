package com.qa.ims.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

public class BadRequestException extends BaseException{

	private static final long serialVersionUID = 7381870460856028314L;

	public BadRequestException(String logMessage, String returnMessage) {
		super(logMessage, returnMessage, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}

	public BadRequestException(String message) {
		super(message, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}

	
}
