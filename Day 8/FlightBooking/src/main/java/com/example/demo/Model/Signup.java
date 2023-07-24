package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "flight")
public class Signup{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userName;
	private String email;
	private String Birthday;
	private String Password;
	private String ConfirmPassword;
	
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
	public String getBirthday() {
		return Birthday;
	}
	public void setBirthday(String birthday) {
		Birthday = birthday;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "Signup [id=" + id + ", userName=" + userName + ", email=" + email + ", Birthday=" + Birthday
				+ ", Password=" + Password + ", ConfirmPassword=" + ConfirmPassword + "]";
	}
	public Signup(int id, String userName, String email, String birthday, String password, String confirmPassword) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		Birthday = birthday;
		Password = password;
		ConfirmPassword = confirmPassword;
	}

	
}