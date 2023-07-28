
package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="user_id", length = 45)
	private int id;
	 @Column(name="user_name", length = 60)
	private String userName;
	 @Column(name="user_email", length = 25)
	private String email;
	 @Column(name="user_password", length = 20)
	private String Password;
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
	public User(int id, String userName, String email, String Password) {
		super();
		this.id = id;
		this.userName = userName;
		
		this.email = email;
		this.Password = Password;
		
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName +  ", email=" + email
				+ ", Password=" + Password +"]";
	}
	public User() {
		super();
		
	}
	
	
	
	

}