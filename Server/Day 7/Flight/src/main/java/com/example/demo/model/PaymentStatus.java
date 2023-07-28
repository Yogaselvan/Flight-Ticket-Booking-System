package com.example.demo.model;

import jakarta.persistence.Id;

public class PaymentStatus {
	@Id
	int status_id;
	//FK reference Reservation(reservation_id);
	int reservation_id;
	String status;
	String payment_date;
	Double amount_paid;
	String payment_method;
	String transaction_id;
	public int getStatus_id() {
		return status_id;
	}
	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}
	public int getReservation_id() {
		return reservation_id;
	}
	public void setReservation_id(int reservation_id) {
		this.reservation_id = reservation_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(String payment_date) {
		this.payment_date = payment_date;
	}
	public Double getAmount_paid() {
		return amount_paid;
	}
	public void setAmount_paid(Double amount_paid) {
		this.amount_paid = amount_paid;
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
		return "Payment_Status [status_id=" + status_id + ", reservation_id=" + reservation_id + ", status=" + status
				+ ", payment_date=" + payment_date + ", amount_paid=" + amount_paid + ", payment_method="
				+ payment_method + ", transaction_id=" + transaction_id + "]";
	}
	
}
