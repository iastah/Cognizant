package com.cognizant.Calculate.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculateServiceTest {

	CalculateService cs;
	
	@BeforeEach
	void init() {
		cs= new CalculateService();
	}
	
	@Test
	void testCalculateCaloriesBurned() {
		assertEquals(20, cs.calculateCaloriesBurned(10,2));
	}

}
