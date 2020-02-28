package com.qa.ims.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

public class BusinessException extends BaseException{

	private static final long serialVersionUID = 5772828959228675720L;

	public BusinessException(String message) {
		super(message, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	public BusinessException(String logMessage, String returnMessage) {
		super(logMessage, returnMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	

	
}
