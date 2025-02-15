package com.student.dao;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.student.entity.Student;
import com.student.repasitory.studentRepository;


@Repository
public class studentDao {
@Autowired
studentRepository sr;

public String post(Student s) {
	sr.save(s);
	return "Saven Successfully";
}
public String post1(List<Student> f) {
	 sr.saveAll(f);
	 return "Success";
}
public List<Student> getAll() {
	return sr.findAll();
}
public Student get(int id) {
	return sr.findById(id).get();
}
public String delete(int id) {
	sr.deleteById(id);
	return "Deleted";
}
public String update(int id,Student g) {
	Student std = sr.findById(id).get();
	 std.setName(g.getName());
	std.setAge(g.getAge());
	std.setGender(g.getGender());
	std.setDepartment(g.getDepartment());
	std.setYear(g.getYear());
	sr.save(std);
	return "Updated Successfully";
}
public List<Student> getCs() {
	return sr.findAll();
}
public List<Student> GetDep() {
	return sr.findAll();
}
public List<Student> getGroup() {
	return sr.findAll();
}
public String postAge(Student h) {
	sr.save(h);
	return "done";
}
public String postStudent(List<Student> w) {
	sr.saveAll(w);
	return "Success";
}
public List<Student> getSecond() {
	return sr.findAll();
	
}
public String postNull(List<Student> m) {
	sr.saveAll(m);
	return "Succed";
}
public String postFind(Student s) {
	sr.save(s);
	return "Doned";
}
}
