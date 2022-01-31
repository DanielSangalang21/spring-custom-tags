package com.example.model;

public class Admin extends User{
	public Admin(){
		this.setUsername("admin"); 
		this.setPassword("0909");
		this.setAccessLevel(User.AccessLevel.ONE);
	}
}
