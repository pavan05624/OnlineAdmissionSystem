package com.cg.oms.entity;

//import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.relational.core.mapping.Table;

@Table(value="Login")
public class Login 
{   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String userName;
	private String password;
	private String role;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String userName, String password, String role) {
		super();
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName= userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	

}
