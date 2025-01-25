package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String homepage() {
		return "home";
	}

	@GetMapping("/admin")
	public String adminpage() {
		System.out.println("inside controller");
		System.out.println("test");
		return "admin";
	}

<<<<<<< Updated upstream
	@GetMapping("/teacher")
	public String teacherpage() {
		System.out.println("inside teacher");
		System.out.println("teacher");
		return "teacher";
=======
	@GetMapping("/dev")
	public String devpage() {
		System.out.println("inside controller dev");
		System.out.println("inside dev");

		return "dev";
>>>>>>> Stashed changes
	}
}
