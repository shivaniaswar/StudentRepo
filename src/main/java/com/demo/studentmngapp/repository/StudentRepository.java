package com.demo.studentmngapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.studentmngapp.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{


	public Student findBySid(int id);
}
