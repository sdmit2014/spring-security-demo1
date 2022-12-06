package com.wecodee.springsecuritydemo.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noAuth")
public class NoAuthenticationController {

	@GetMapping("/hi")
	public String sayHello() {
		return " ############## Hello Every One ##############";
	}

}
