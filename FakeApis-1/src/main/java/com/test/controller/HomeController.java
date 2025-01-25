package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String homepage() {
		System.out.println("inside home");
		System.out.println("inside home");

		return "home";
	}
}
