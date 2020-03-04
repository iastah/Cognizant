package com.cognizant.Calculate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cognizant.Calculate.dto.CalcDTO;

@Service
public class CalculateService {

	public CalcDTO getCalculation(String typeName, String gender, Long duration) {

		CalcDTO dto = new CalcDTO();
		dto.setTypeName(typeName);
		dto.setGender(gender);
		dto.setDuration(duration);
		dto.setIntensityLevel("Light");
		// query exercise-repository
		Long id = getExercise(typeName, "Light");
		dto.setId(id);
		// query calories-repository
		Integer cals = getCalories(dto.getId(), dto.getGender());
		dto.setCaloriesPerMin(cals);
		// calculate calories burned
		long totalCals = calculateCaloriesBurned(dto.getDuration(), dto.getCaloriesPerMin());
		dto.setTotalCalBurned(totalCals);

		return dto;
	}

	public Long getExercise(String typeName, String intensityLevel) {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "http://localhost:9000/exercises/getId/" + typeName + "/Light";
		ResponseEntity<Long> response = restTemplate.getForEntity(fooResourceUrl, Long.class);

		return response.getBody();
	}

	public Integer getCalories(Long id, String gender) {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "http://localhost:9001/calories/" + id + "/" + gender;
		ResponseEntity<Integer> response = restTemplate.getForEntity(fooResourceUrl, Integer.class);

		return response.getBody();
	}

	public long calculateCaloriesBurned(long duration, int calPerMin) {

		return duration * calPerMin;
	}

}
