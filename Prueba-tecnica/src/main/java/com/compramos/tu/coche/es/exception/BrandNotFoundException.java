package com.compramos.tu.coche.es.exception;

import org.springframework.core.NestedRuntimeException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BrandNotFoundException extends NestedRuntimeException  {

	private static final long serialVersionUID = 1L;

	public BrandNotFoundException(String message, Throwable cause) {
		super(String.format(message + " exception " + cause.toString()));
	}

	public BrandNotFoundException(String message) {
		super(String.format(message));
	}

	public BrandNotFoundException(Throwable cause) {
		super(String.format(cause.toString()));
	}

}
