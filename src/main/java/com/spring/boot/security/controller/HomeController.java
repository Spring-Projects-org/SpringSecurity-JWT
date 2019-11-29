package com.spring.boot.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	
	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "This is JWT Autheticated App";
	}

}
