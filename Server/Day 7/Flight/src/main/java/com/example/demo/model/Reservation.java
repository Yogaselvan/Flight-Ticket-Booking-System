package com.example.demo.model;

import jakarta.persistence.Id;

public class Reservation {
	@Id
	int reservation_id;
	//FK reference passenger(passenger_id)
	int passenger_id;
	//FK reference Flight_details(flight_id)
	int flight_id;
	//FK reference Seat_Details(seat_id)
	int seat_id;
	String reservation_date;
	double total_cost;
	String payment_status;
	public int getReservation_id() {
		return reservation_id;
	}
	public void setReservation_id(int reservation_id) {
		this.reservation_id = reservation_id;
	}
	public int getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}
	public int getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}
	public int getSeat_id() {
		return seat_id;
	}
	public void setSeat_id(int seat_id) {
		this.seat_id = seat_id;
	}
	public String getReservation_date() {
		return reservation_date;
	}
	public void setReservation_date(String reservation_date) {
		this.reservation_date = reservation_date;
	}
	public double getTotal_cost() {
		return total_cost;
	}
	public void setTotal_cost(double total_cost) {
		this.total_cost = total_cost;
	}
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	@Override
	public String toString() {
		return "Reservation [reservation_id=" + reservation_id + ", passenger_id=" + passenger_id + ", flight_id="
				+ flight_id + ", seat_id=" + seat_id + ", reservation_date=" + reservation_date + ", total_cost="
				+ total_cost + ", payment_status=" + payment_status + "]";
	}
	
}
