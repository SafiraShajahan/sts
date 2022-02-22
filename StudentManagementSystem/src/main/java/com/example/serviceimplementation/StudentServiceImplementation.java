
package com.example.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.*;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;


@Service
public class StudentServiceImplementation implements StudentService{

	@Autowired
	StudentRepository studentRepository ;
	
	@Override
	public void addStudentDetails(StudentEntity studentEntityObj) {
		
		studentRepository.save(studentEntityObj);
		
	}
	
	public StudentEntity findByStudentEmailAndStudentPassword(String studentEmail,String studentPassword )
	{
		return studentRepository.findByStudentEmailAndStudentPassword(studentEmail, studentPassword);
	}

	@Override
	public List<StudentEntity> displayAllStudentList() {
		
		return studentRepository.findAll();
	}

}