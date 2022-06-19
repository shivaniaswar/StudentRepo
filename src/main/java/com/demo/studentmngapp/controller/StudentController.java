package com.demo.studentmngapp.controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.studentmngapp.model.Student;
import com.demo.studentmngapp.service.StudentServiceI;

@RestController
public class StudentController {
    @Autowired
	StudentServiceI studentservicei;
	private static final Logger logger=LoggerFactory.getLogger(StudentController.class);
	
	@PostMapping(value="/addstudent")
	public Student addStudent(@RequestBody Student student) {
		logger.info("inside controller addstudent() method");
	    Student student1=studentservicei.addStudent(student);
		logger.info("Student data saved successfully");
		return student1;
	}
	
	@GetMapping(value="/getallstudent")
	public List<Student> getAllStudent(){
		logger.info("Inside student controller getallstudent()");
		List<Student> studentlist=studentservicei.getAllStudent();
		return studentlist;
		
	}
	@GetMapping(value="/getstudent/{id}")
	public Student getStudent(@PathVariable int id) {
		logger.info("inside controller!!! getStudent()");
		Student student=studentservicei.getStudent(id);
		return student;
		
	}
	@DeleteMapping(value="/deletestudent/{id}")
	public String removeStudent(@PathVariable int id) {
		logger.info("removestudent() method invoked");
		studentservicei.deleteStudent(id);
		return "student removed sucessfully";
		
	}
	
	
}
