package com.example.model;

public class Member extends User{
	public Member(){
		this.setUsername("member"); 
		this.setPassword("0909");
		this.setAccessLevel(User.AccessLevel.TWO);
	}
}
