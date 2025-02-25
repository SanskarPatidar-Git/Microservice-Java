package com.java.service_b;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("skills")
public class SkillsController {

	@Autowired
	SkillsService service;
	
	@PostMapping("save")
	public ResponseEntity<String> saveSkill(@RequestBody SkillsDto skill){
		return service.saveSkill(skill);
	}
	
	@GetMapping("getall")
	public ResponseEntity<List<SkillsDto>> getAllSkills(){
		return service.getAllSkill();
	}
	
}
