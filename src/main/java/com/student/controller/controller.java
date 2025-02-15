package com.student.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.CustomException.AgeException;
import com.student.entity.Student;
import com.student.service.studentService;


@RestController
@RequestMapping(value = "/Student")
public class controller {
	
	@Autowired
	studentService se;
	@PostMapping(value = "/PostStudent")
	public String post(@RequestBody Student s) {
		return se.post(s);
	}
	@PostMapping(value="/PostStudent1")
	public String post1(@RequestBody List<Student> f) {
		return se.post1(f);
	}
	@GetMapping(value = "/GetAll") 
	public List<Student> getAll() {
		return se.getAll();
	}
	
	@GetMapping(value = "/Get/{id}")
	public Student get(@PathVariable  int id) {
		return se.get(id);
	}
	@DeleteMapping(value = "/Del/{id}")
	public String delete(@PathVariable int id) {
		return se.delete(id);
	}
	@PutMapping(value = "UpdateEmp/{id}")
	public String update(@PathVariable int id, @RequestBody Student g) {
		return se.update(id,g);
	}
	@GetMapping(value = "/getCs")
	public List<Student> getCs() {
		return se.getCs();
	}
	@GetMapping(value = "/GetDep")
	public List<Student> getDep() {
		return se.GetDep();
	}
	
	@GetMapping(value = "/GetGroup") 
	public Map<String, List<Student>> getGroup() {
		return se.getGroup();
		
	}
	@PostMapping(value = "/GetAge")
	public String postAge(@RequestBody Student h) {
		return se.post(h);
		
	}
	@PostMapping(value = "/GetTotal") 
	public String postStudent(@RequestBody List<Student> w) {
		return se.postStudent(w);
	}
	@GetMapping(value = "/GetSecond")
	public Student getSecond() {
		return se.getSecond();
	}
	@PostMapping(value ="/null") 
	public String postNull(@RequestBody List<Student> m) {
		return se.postNull(m);
	}
	@PostMapping(value = "/FindA")
	public String postFind(@RequestBody Student s) throws AgeException {
		return se.postFind(s);
	}
}
