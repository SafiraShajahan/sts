package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.*;


public interface StudentRepository extends JpaRepository<StudentEntity, Integer>
{
	public StudentEntity findByStudentEmailAndStudentPassword(String studentEmail,String studentPassword );
}