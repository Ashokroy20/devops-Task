package com.student.service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.CustomException.AgeException;
import com.student.dao.studentDao;
import com.student.entity.Student;


@Service
public class studentService {
	@Autowired
	studentDao sd;
	public String post (Student s) {
		return sd.post(s);
	}
	public String post1(List<Student> f) {
		return sd.post1(f);
	}
	public List<Student> getAll() {
		return sd.getAll();
	}
	public Student get(int id) {
		return sd.get(id);
	}
	public String delete(int id) {
		return sd.delete(id);
	}
	public String update(int id , Student g) {
		return sd.update(id,g);
	}
	public List<Student> getCs() {
		return sd.getAll().stream().filter(x->x.getDepartment().equals("BCA")).collect(Collectors.toList());
	}
	public List<Student> GetDep() {
		return sd.getAll().stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getDepartment)).collect(Collectors.toList());
	}
	public Map<String,List<Student>> getGroup() {
		return sd.getAll().stream().collect(Collectors.groupingBy(x->x.getDepartment(),Collectors.toList()));
		
	}
	public String postAge(Student h) {
		if(h.getAge()<22) {
			return sd.postAge(h);
		}
		else {
			return "Age not Eligible object not posted";
		}
	}
	public String postStudent(List<Student> w) {
		List<Student>Students= w.stream().filter(x-> x.getAge()<22).collect(Collectors.toList());
		return sd.post1(Students);
	}
	public Student getSecond() {
		return sd.getSecond().stream().sorted(Comparator.comparing(Student::getAge).reversed()).skip(1).findFirst().orElse(null);

	}
	public String postNull(List<Student> m) {
		List<Student> s1= m.stream().filter(x-> x.getName().isBlank()).collect(Collectors.toList());
		return sd.postNull(s1);
	}
	public String postFind(Student s) throws AgeException {
	//	try {
		if(s.getAge()>=18) {
			return sd.postFind(s);
		}
		else {
			throw new AgeException("Invalid");
		}
	//	}
	//	catch (AgeException ae) {
	//		return "Age not valid";
	//	}
	}
}
