package com.demo.studentmngapp.service;

import java.util.List;

import com.demo.studentmngapp.model.Student;

public interface StudentServiceI {

public	Student addStudent(Student student);

public List<Student> getAllStudent();

public Student getStudent(int id);

public void deleteStudent(int id);

}
