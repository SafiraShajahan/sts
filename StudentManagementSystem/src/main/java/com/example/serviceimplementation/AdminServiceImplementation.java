package com.example.serviceimplementation;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.*;
import com.example.repository.*;
import com.example.service.*;

@Service
public class AdminServiceImplementation implements AdminService
{
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public AdminEntity findByAdminLoginAndAdminPassword(String adminLogin, String adminPassword) {
		
		 AdminEntity adminEntity=  adminRepository.findByAdminLoginAndAdminPassword(adminLogin, 
				 adminPassword);
		return adminEntity;
	}
}