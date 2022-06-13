package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {
	@GetMapping("/final")
	public String task() {
		return "login";
	}
}