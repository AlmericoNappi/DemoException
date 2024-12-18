package com.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class RestExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(DuplicateException.class)
	public final ResponseEntity<ErrorResponse> exceptionDuplicateHandler(Exception ex){
		
		ErrorResponse errore = new ErrorResponse();
		
		errore.setCodice(HttpStatus.CONFLICT.value());
		
		errore.setMessaggio(((DuplicateException)ex).getMessaggio());
		
		return new ResponseEntity<ErrorResponse>(errore, new HttpHeaders(), HttpStatus.CONFLICT.value());
	}
	
	
	@ExceptionHandler(NotFoundException.class)
	public final ResponseEntity<ErrorResponse> exceptionNotFoundHandler(Exception ex){
		
		ErrorResponse errore = new ErrorResponse();
		
		errore.setCodice(HttpStatus.NOT_FOUND.value());
		
		errore.setMessaggio(ex.getMessage());
		
		return new ResponseEntity<ErrorResponse>(errore, new HttpHeaders(), HttpStatus.NOT_FOUND.value());
	}
}
