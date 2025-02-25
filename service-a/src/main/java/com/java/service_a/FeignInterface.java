package com.java.service_a;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("SERVICE-B")
public interface FeignInterface {

	@PostMapping("skills/save")
	public ResponseEntity<String> saveSkill(@RequestBody SkillsDto skill);
	
	
	@GetMapping("skills/getall")
	public ResponseEntity<List<SkillsDto>> getAllSkills();
}
