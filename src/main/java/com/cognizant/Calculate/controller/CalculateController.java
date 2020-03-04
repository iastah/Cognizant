package com.cognizant.Calculate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.Calculate.dto.CalcDTO;
import com.cognizant.Calculate.service.CalculateService;

@RestController
@RequestMapping("/calories/calculate")
public class CalculateController {
	
	@Autowired
	CalculateService cs;

	@GetMapping("ping")
	public String ping() {
		return "pong";
	}
	
//	@GetMapping("/{typeName}")
//	public CalcDTO greeting(@PathVariable String typeName, @RequestParam(value = "gender", defaultValue = "M") String gender,
//			@RequestParam(value = "duration", defaultValue = "10") String duration) {
//		return service;
//	}
	@GetMapping("/{typeName}")
	public CalcDTO getCaloriesBurned(@PathVariable String typeName, @RequestParam(value = "gender", defaultValue = "M") String gender,
			@RequestParam(value = "duration", defaultValue = "10") String duration) {
			CalcDTO re= cs.getCalculation(typeName, gender, Long.valueOf(duration));
			return re;
	}
}
