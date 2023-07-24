package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FlightDetails {
    @Id
    int id;
    String fromLocation;
    String toLocation;
    String depart;
    String returnDate;
    String cabin;

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    @Override
    public String toString() {
        return "FlightDetails [fromLocation=" + fromLocation + ", toLocation=" + toLocation + ", depart=" + depart
                + ", returnDate=" + returnDate + ", cabin=" + cabin + "]";
    }

	public FlightDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
