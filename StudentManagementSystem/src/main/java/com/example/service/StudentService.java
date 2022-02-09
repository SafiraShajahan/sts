package com.example.service;

//package com.base.service;
//
//import com.base.entity.StudentEntity;
//
//public interface StudentService {
//	
//	public void addStudent(StudentEntity student);
//}


import java.util.List;

import com.example.entity.*;

public interface StudentService {
	List<StudentEntity> getAllStudents();
	
	StudentEntity saveStudent(StudentEntity student);
	
	StudentEntity getStudentById(Long id);
	
	StudentEntity updateStudent(StudentEntity student);
	
	void deleteStudentById(Long id);
}