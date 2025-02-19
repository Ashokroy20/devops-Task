package com.devopstask2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;
	public String postAll(List<EmployeeEntity> e) {
		er.saveAll(e);
		return "Saved Successfully";
	}

	public java.util.Optional<EmployeeEntity> get(int a) {
		return er.findById(a);
	}


}
