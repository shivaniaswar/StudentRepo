package com.demo.studentmngapp.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.studentmngapp.model.Student;
import com.demo.studentmngapp.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceI {
    @Autowired
	StudentRepository studentRepository;
	private static final Logger logger=LoggerFactory.getLogger(StudentServiceImpl.class);
	
	@Override
	public Student addStudent(Student student) {
		logger.info("inside service layer addstudent() method : "+student.getFirstName());
		return studentRepository.save(student);
	}
    @Override
	public List<Student> getAllStudent() {
		logger.info("service layer getAllStudent()");
		return studentRepository.findAll();
	}
	@Override
	public Student getStudent(int id) {
		logger.debug("Authenticating student by ID :"+ id);
		Student student=studentRepository.findBySid(id);
		return student;
	}
    @Override
	public void deleteStudent(int id) {
	   studentRepository.deleteById(id);
		logger.info("student data deleted");
   }

}
