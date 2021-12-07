package com.greatlearning.student;

import java.util.List;

import org.springframework.stereotype.Service;

//create interface and define abstract methods in service class
@Service
public interface StudentService {
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student theBook);

	public void deleteById(int theId);

}
