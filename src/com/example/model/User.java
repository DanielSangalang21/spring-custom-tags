package com.example.model;

public class User {
	private String username;
	private String password;
	public static enum AccessLevel{ONE,TWO};
	private AccessLevel accessLevel;
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
	public AccessLevel getAccessLevel() {
		return accessLevel;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAccessLevel(AccessLevel accessLevel) {
		this.accessLevel = accessLevel;
	}
	
	public User validateCredentials(String pass,String userName) {
		Admin admin = new Admin();
		Member member = new Member();
		
		if (pass.equals(admin.getPassword()) && userName.equals(admin.getUsername())) {
			return admin;
		}
		else if (pass.equals(member.getPassword()) && userName.equals(member.getUsername())){
			return member;
		}
		return null;
	}
}
