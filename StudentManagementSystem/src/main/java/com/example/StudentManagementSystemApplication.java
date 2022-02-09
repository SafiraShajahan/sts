package com.example;

//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class StudentMngmtSystemApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(StudentMngmtSystemApplication.class, args);
//	}
//implements CommandLineRunner
//}
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.*;
import com.example.repository.*;

@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

//	@Autowired
	
//	private StudentRepository studentRepository;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		/*
//		 * Student student1 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
//		 * studentRepository.save(student1);
//		 * 
//		 * Student student2 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
//		 * studentRepository.save(student2);
//		 * 
//		 * Student student3 = new Student("tony", "stark", "tony@gmail.com");
//		 * studentRepository.save(student3);
//		 */
//		
	

}
