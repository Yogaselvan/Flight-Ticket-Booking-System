package com.example.demo.model;

import jakarta.persistence.Id;

public class Airport {
	@Id
	int airport_id;
	String airport_name;
	String city;
	String country;
	String timezone;
	public int getAirport_id() {
		return airport_id;
	}
	public void setAirport_id(int airport_id) {
		this.airport_id = airport_id;
	}
	public String getAirport_name() {
		return airport_name;
	}
	public void setAirport_name(String airport_name) {
		this.airport_name = airport_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	@Override
	public String toString() {
		return "Airporst [airport_id=" + airport_id + ", airport_name=" + airport_name + ", city=" + city + ", country="
				+ country + ", timezone=" + timezone + "]";
	}
	
}
