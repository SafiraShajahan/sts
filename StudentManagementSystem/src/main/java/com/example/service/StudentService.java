
package com.example.service;

import java.util.List;

import com.example.entity.*;



public interface StudentService 
{
	public void addStudentDetails(StudentEntity place);
	public StudentEntity findByStudentEmailAndStudentPassword(String studentEmail,String studentPassword );
	
	public List<StudentEntity> displayAllStudentList();
}