package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.*;

public interface AdminRepository extends JpaRepository<AdminEntity, Integer>{
	
	public AdminEntity findByAdminLoginAndAdminPassword(String adminLogin, String adminPassword);

}