package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.StaffEntity;


public interface StaffRepository extends JpaRepository<StaffEntity, Integer>
{

	public StaffEntity findByStaffMailAndStaffPassword(String staffMail, String staffPassword);

}