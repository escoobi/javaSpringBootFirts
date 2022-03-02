package com.firtprojetc.springbootweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {
	
	@GetMapping("/")
	public String msg() {
		return "The book in on the table!";
		
	}

}
