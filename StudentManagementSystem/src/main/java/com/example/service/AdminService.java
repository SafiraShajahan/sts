package com.example.service;
import com.example.entity.*;

public interface AdminService 
{
    public AdminEntity  findByAdminLoginAndAdminPassword(String adminLogin, String adminPassword);
	
}






