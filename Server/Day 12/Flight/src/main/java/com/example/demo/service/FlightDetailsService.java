package com.example.demo.service;

import com.example.demo.model.FlightDetails;
import com.example.demo.repository.FlightDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightDetailsService {
    private final FlightDetailsRepository flightDetailsRepository;

    public FlightDetailsService(FlightDetailsRepository flightDetailsRepository) {
        this.flightDetailsRepository = flightDetailsRepository;
    }

    public List<FlightDetails> getAllFlightDetails() {
        return flightDetailsRepository.findAll();
    }
    public Optional<FlightDetails> findFromTo(String from,String to) {
        return flightDetailsRepository.findFromTO(from, to);
    }

    public Optional<FlightDetails> getFlightDetailsById(int id) {
        return flightDetailsRepository.findById(id);
    }

    public FlightDetails saveFlightDetails(FlightDetails flightDetails) {
        return flightDetailsRepository.save(flightDetails);
    }

    public void deleteFlightDetailsById(int id) {
        flightDetailsRepository.deleteById(id);
    }
}
