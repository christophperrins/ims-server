package com.qa.ims.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import com.qa.ims.dto.error.ErrorDto;

abstract public class BaseException extends RuntimeException{

	private static final long serialVersionUID = 1666183376196515796L;

	private String message;
	private ExceptionBody body;
	private HttpHeaders httpHeaders;
	private HttpStatus httpStatus;
	
	public BaseException(String logMessage, String returnMessage, HttpHeaders headers, HttpStatus status) {
		this.httpStatus = status;
		this.httpHeaders = headers;
		this.message = logMessage;
		this.body = getBody(returnMessage);
	}
	
	public BaseException(String message, HttpHeaders headers, HttpStatus status) {
		this.httpStatus = status;
		this.httpHeaders = headers;
		this.message = message;
		this.body = getBody(message);
	}
	
	public ExceptionBody getBody(String message) {
		ExceptionBody exceptionObject = new ExceptionBody();
		ErrorDto error = new ErrorDto();
		error.setMessage(message);
		error.setStatus(this.httpStatus.value());
		exceptionObject.setError(error);
		System.out.println(exceptionObject.getError().getMessage().toString());
		return exceptionObject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ExceptionBody getBody() {
		return body;
	}

	public void setBody(ExceptionBody body) {
		this.body = body;
	}

	public HttpHeaders getHttpHeaders() {
		return httpHeaders;
	}

	public void setHttpHeaders(HttpHeaders httpHeaders) {
		this.httpHeaders = httpHeaders;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
