package com.cognizant.Calculate.dto;


public class CalcDTO {
	
	private Long id;
    private String typeName;
    private String intensityLevel;
    private String gender;
    private Long duration;
    private Integer caloriesPerMin;
    private Long totalCalBurned;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getIntensityLevel() {
		return intensityLevel;
	}
	public void setIntensityLevel(String intensityLevel) {
		this.intensityLevel = intensityLevel;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public Integer getCaloriesPerMin() {
		return caloriesPerMin;
	}
	public void setCaloriesPerMin(Integer caloriesPerMin) {
		this.caloriesPerMin = caloriesPerMin;
	}
	public Long getTotalCalBurned() {
		return totalCalBurned;
	}
	public void setTotalCalBurned(Long totalCalBurned) {
		this.totalCalBurned = totalCalBurned;
	}

}
