package com.devopstask2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@PostMapping(value = "/post")
	public String postAll(@RequestBody List<EmployeeEntity> e) {
		return es.postAll(e);
	}
	@GetMapping(value = "/{a}") 
		public Optional<EmployeeEntity> get(@PathVariable int a) {
		return es.get(a);
	}
	

}
