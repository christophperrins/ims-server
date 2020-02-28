package com.qa.ims.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandling extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(BaseException.class)
	public ResponseEntity<ExceptionBody> handleException(BaseException ex) {
		Logger logger = LoggerFactory.getLogger(ExceptionHandling.class);
		logger.error(ex.getMessage());
		return new ResponseEntity<ExceptionBody>(ex.getBody(), ex.getHttpHeaders(), ex.getHttpStatus());
	}
	
}
