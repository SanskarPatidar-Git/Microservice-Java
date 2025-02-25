package com.java.service_a;

public class SkillsDto {

	private int id;
	private String skill;
	private float rating;
	
	public SkillsDto(int id, String skill, float rating) {
		this.id = id;
		this.skill = skill;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
	
}
