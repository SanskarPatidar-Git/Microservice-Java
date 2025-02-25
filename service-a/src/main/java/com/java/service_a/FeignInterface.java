package com.java.service_a;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/*
 * @FeignClient-
 * It is used for calling an another service with less boilerplate code.
 * It needs Service registry to find the service at runtime.
 * When we are using RestTemplate we need to specify the URL but when app runs in production with multiple instances we don't know IP and port at early stage
 * so it needs service registry to identify it. In our case we used Eureka Server.
 * 
 * @FeignClient("SERVICE-B")-
 * Here we describe the service name which contains that methods which we need to call.
 * It is simply interface which contains method signature.
 */

@FeignClient("SERVICE-B")
public interface FeignInterface {

	@PostMapping("skills/save")
	public ResponseEntity<String> saveSkill(@RequestBody SkillsDto skill);
	
	
	@GetMapping("skills/getall")
	public ResponseEntity<List<SkillsDto>> getAllSkills();
}
