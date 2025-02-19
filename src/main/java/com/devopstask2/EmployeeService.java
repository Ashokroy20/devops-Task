package com.devopstask2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;
	public String postAll(List<EmployeeEntity> e) {
		return ed.postAll(e);
	}
	public Optional<EmployeeEntity> get(int a) {
		return ed.get(a);
	}


}
