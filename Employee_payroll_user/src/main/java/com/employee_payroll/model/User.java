package com.employee_payroll.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "username")
	private String username;

	@Column(name = "name")
	private String name;

	@Column(name = "password")
	private String password;

	@Column(name = "role")
	private String role;

	@Column(name = "token")
	private String token;


	


	public User() {
		super();
		
	}


	public long getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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


	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}


	public User(int id, String username, String name, String password, String role, String token) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.password = password;
		this.role = role;
		this.token = token;
	}
	
	
	

}