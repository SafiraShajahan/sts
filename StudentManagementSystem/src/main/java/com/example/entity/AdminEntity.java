package com.example.entity;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "admin")
	public class AdminEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int adminId;
		@Column
		private String adminLogin;
		@Column
		private String adminPassword;
/////		
	   @OneToMany(cascade=CascadeType.ALL)
		private List<StaffEntity> staff;
////		 
////			
		@OneToMany(cascade=CascadeType.ALL)
		private List<StudentEntity> student;
		
	
		
		public String getAdminLogin() {
			return adminLogin;
		}
		public void setAdminLogin(String adminLogin) {
			this.adminLogin = adminLogin;
		}
		public String getAdminPassword() {
			return adminPassword;
		}
		public void setAdminPassword(String adminPassword) {
			this.adminPassword = adminPassword;
		}
		public AdminEntity() {
			super();
			// TODO Auto-generated constructor stub
		}
		public AdminEntity(int adminId, String adminLogin, String adminPassword) {
			super();
			this.adminId = adminId;
			this.adminLogin = adminLogin;
			this.adminPassword = adminPassword;
		}
		@Override
		public String toString() {
			return "AdminEntity [adminId=" + adminId + ", adminLogin=" + adminLogin + ", adminPassword=" + adminPassword
					+ "]";
		}
		
	
}
