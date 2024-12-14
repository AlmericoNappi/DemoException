package com.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class HelloContoller {

	@RequestMapping(value ="/ciao", method = RequestMethod.GET, produces ="application/json")
	
	public ResponseEntity<String> helloWorld() throws DuplicateException {
		
		System.out.println("dentro");
		
		if ( 1 == 1) {
			throw new DuplicateException();
		}
		
		//stringa inferiore incompleta
return new ResponseEntity<String>("ciao mamma", HttpStatus.OK);
	}
}
