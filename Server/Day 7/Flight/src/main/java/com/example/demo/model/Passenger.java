package com.example.demo.model;

import jakarta.persistence.Id;

public class Passenger {
	@Id
	int Passenger_id;
	String First_name;
	String Last_name;
	String Gender;
	String DOB;
	String Nationality;
	String Email;
	int Phone_Number;
	String Address;
	public int getPassenger_id() {
		return Passenger_id;
	}
	public void setPassenger_id(int passenger_id) {
		Passenger_id = passenger_id;
	}
	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getNationality() {
		return Nationality;
	}
	public void setNationality(String nationality) {
		Nationality = nationality;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getPhone_Number() {
		return Phone_Number;
	}
	public void setPhone_Number(int phone_Number) {
		Phone_Number = phone_Number;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Passenger [Passenger_id=" + Passenger_id + ", First_name=" + First_name + ", Last_name=" + Last_name
				+ ", Gender=" + Gender + ", DOB=" + DOB + ", Nationality=" + Nationality + ", Email=" + Email
				+ ", Phone_Number=" + Phone_Number + ", Address=" + Address + "]";
	}
	
}
