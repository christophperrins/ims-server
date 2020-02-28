package com.qa.ims.exceptions;

import com.qa.ims.dto.error.ErrorDto;

public class ExceptionBody {
	
	private ErrorDto error;

	public ErrorDto getError() {
		return error;
	}

	public void setError(ErrorDto error) {
		this.error = error;
	}

}