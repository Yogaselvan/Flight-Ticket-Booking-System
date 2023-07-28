package com.example.demo.model;

import jakarta.persistence.Id;

public class FlightService {
	@Id
	int Service_id;
//	foreignkey_flight_id(FLight_Details)
	int Flight_id;
	String Service_name;
	String Description;
	float Price;
	public int getService_id() {
		return Service_id;
	}
	public void setService_id(int service_id) {
		Service_id = service_id;
	}
	public int getFlight_id() {
		return Flight_id;
	}
	public void setFlight_id(int flight_id) {
		Flight_id = flight_id;
	}
	public String getService_name() {
		return Service_name;
	}
	public void setService_name(String service_name) {
		Service_name = service_name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Flight_Service [Service_id=" + Service_id + ", Flight_id=" + Flight_id + ", Service_name="
				+ Service_name + ", Description=" + Description + ", Price=" + Price + "]";
	}
	
}
