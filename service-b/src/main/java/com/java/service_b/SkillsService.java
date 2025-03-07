package com.java.service_b;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SkillsService {

	@Autowired
	SkillsRepository repository;
	
	public ResponseEntity<String> saveSkill(SkillsDto skill) {
		repository.save(skill);
		return new ResponseEntity<String>("SUCCESS",HttpStatus.CREATED);
	}
	
	public ResponseEntity<List<SkillsDto>> getAllSkill() {
		List<SkillsDto> skillsList = repository.findAll();
		return new ResponseEntity<List<SkillsDto>>(skillsList,HttpStatus.OK); 
	}
}
