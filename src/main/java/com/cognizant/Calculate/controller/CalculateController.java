package com.cognizant.Calculate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calories/calculate")
public class CalculateController {

	@GetMapping("ping")
	public String ping() {
		return "pong";
	}
}
