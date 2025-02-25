package com.java.service_a;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AService {

	@Autowired
	FeignInterface feignInterface;
	
	public ResponseEntity<String> save(SkillsDto skill) {
		return feignInterface.saveSkill(skill);
	}
	
	public ResponseEntity<List<SkillsDto>> getAll() {
		return feignInterface.getAllSkills();
	}
}
