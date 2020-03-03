package com.cognizant.Calculate.service;

public class CalculateService {
	
	public long calculateCaloriesBurned(long duration, long calPerMin) {
		return duration*calPerMin;
	}

}
