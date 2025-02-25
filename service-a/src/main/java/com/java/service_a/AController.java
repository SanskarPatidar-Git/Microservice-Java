package com.java.service_a;

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
public class AController {
	
	@Autowired
	AService service;
	
	@PostMapping("save")
	public ResponseEntity<String> save(@RequestBody SkillsDto dto){
		return service.save(dto);
	}
	
	@GetMapping("getall")
	public ResponseEntity<List<SkillsDto>> getAll(){
		return service.getAll();
	}
}
