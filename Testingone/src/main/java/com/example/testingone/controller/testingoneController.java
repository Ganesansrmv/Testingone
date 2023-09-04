package com.example.testingone.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testingoneController {

	@GetMapping("/Evenform")
	public String inputform() {
		return "inputForm";
	}

	@GetMapping("/evenchk")
	@ResponseBody
	public boolean evenchk(@RequestParam("number") int number) {
		return (number % 2 == 0);
	}

}
