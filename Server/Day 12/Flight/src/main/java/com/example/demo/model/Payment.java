package com.example.demo.model;

import jakarta.persistence.Id;

public class Payment {
	@Id
	int payment_id;
	//FK reservation_id refer Reservation(reservation_id)
	int reservation_id;
	String payment_date;
	Double amount;
	String payment_method;
	String transaction_id;
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public int getReservation_id() {
		return reservation_id;
	}
	public void setReservation_id(int reservation_id) {
		this.reservation_id = reservation_id;
	}
	public String getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(String payment_date) {
		this.payment_date = payment_date;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getPayment_method() {
		return payment_method;
	}
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	@Override
	public String toString() {
		return "Payment [payment_id=" + payment_id + ", reservation_id=" + reservation_id + ", payment_date="
				+ payment_date + ", amount=" + amount + ", payment_method=" + payment_method + ", transaction_id="
				+ transaction_id + "]";
	}
	
}
