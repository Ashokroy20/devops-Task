package com.student.repasitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import com.student.entity.Student;

public interface studentRepository extends JpaRepository<Student,Integer> {

}
