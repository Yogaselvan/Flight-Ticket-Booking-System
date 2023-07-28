package com.example.demo.repository;

import com.example.demo.model.FlightDetails;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FlightDetailsRepository extends JpaRepository<FlightDetails, Integer> {
	@Query("select fd from FlightDetails fd where fd.fromLocation = ?1 and fd.toLocation = ?2")
	public Optional<FlightDetails> findFromTO(String fromLocation,String toLocation);
}
