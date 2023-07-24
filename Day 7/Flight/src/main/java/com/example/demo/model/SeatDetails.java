package com.example.demo.model;

import jakarta.persistence.Id;

public class SeatDetails {
	@Id
	int seat_id;
	//foregin key reference flightdetails(flight_id);
	int flight_id;
	String seat_number;
	String seat_class;
	String is_available;
	int passenger_id;
	public int getSeat_id() {
		return seat_id;
	}
	public void setSeat_id(int seat_id) {
		this.seat_id = seat_id;
	}
	public int getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}
	public String getSeat_number() {
		return seat_number;
	}
	public void setSeat_number(String seat_number) {
		this.seat_number = seat_number;
	}
	public String getSeat_class() {
		return seat_class;
	}
	public void setSeat_class(String seat_class) {
		this.seat_class = seat_class;
	}
	public String getIs_available() {
		return is_available;
	}
	public void setIs_available(String is_available) {
		this.is_available = is_available;
	}
	public int getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}
	@Override
	public String toString() {
		return "Seat_Details [seat_id=" + seat_id + ", flight_id=" + flight_id + ", seat_number=" + seat_number
				+ ", seat_class=" + seat_class + ", is_available=" + is_available + ", passenger_id=" + passenger_id
				+ "]";
	}
	
}
