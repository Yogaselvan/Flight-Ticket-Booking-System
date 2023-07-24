
package com.example.demo.userdto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Userdto {
	@Id
	private int id;
	private String userName;
	
	private String email;
	private String Password;

	public Userdto(int id, String userName, String email, String Password) {
		super();
		this.id = id;
		this.userName = userName;
		
		this.email = email;
		this.Password = Password;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}

}