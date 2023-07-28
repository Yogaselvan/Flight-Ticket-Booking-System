package com.example.demo.model;

import jakarta.persistence.Id;

public class FlightCost {
	@Id
	int cost_id;
	//foreign key reference flight_details(flight_id)
	int flight_id;
	String seat_class;
	Double base_fare;
	Double tax_amount;
	double additional_fees;
	double total_cost;
	public int getCost_id() {
		return cost_id;
	}
	public void setCost_id(int cost_id) {
		this.cost_id = cost_id;
	}
	public int getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}
	public String getSeat_class() {
		return seat_class;
	}
	public void setSeat_class(String seat_class) {
		this.seat_class = seat_class;
	}
	public Double getBase_fare() {
		return base_fare;
	}
	public void setBase_fare(Double base_fare) {
		this.base_fare = base_fare;
	}
	public Double getTax_amount() {
		return tax_amount;
	}
	public void setTax_amount(Double tax_amount) {
		this.tax_amount = tax_amount;
	}
	public double getAdditional_fees() {
		return additional_fees;
	}
	public void setAdditional_fees(double additional_fees) {
		this.additional_fees = additional_fees;
	}
	public double getTotal_cost() {
		return total_cost;
	}
	public void setTotal_cost(double total_cost) {
		this.total_cost = total_cost;
	}
	@Override
	public String toString() {
		return "Flight_Cost [cost_id=" + cost_id + ", flight_id=" + flight_id + ", seat_class=" + seat_class
				+ ", base_fare=" + base_fare + ", tax_amount=" + tax_amount + ", additional_fees=" + additional_fees
				+ ", total_cost=" + total_cost + "]";
	}
	
}
