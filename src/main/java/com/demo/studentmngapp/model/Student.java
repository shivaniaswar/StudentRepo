package com.demo.studentmngapp.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="studentinfo")
@Getter
@Setter
public class Student {

	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int sid;
	private String firstName;
	private String lastName;
	private int age;
	private String email;
}
