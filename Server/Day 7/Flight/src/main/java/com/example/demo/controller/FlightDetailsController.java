package com.example.demo.controller;

import com.example.demo.model.FlightDetails;
import com.example.demo.service.FlightDetailsService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/flightdetails")
public class FlightDetailsController {
    private final FlightDetailsService flightDetailsService;

    public FlightDetailsController(FlightDetailsService flightDetailsService) {
        this.flightDetailsService = flightDetailsService;
    }

    @GetMapping
    public ResponseEntity<List<FlightDetails>> getAllFlightDetails() {
        List<FlightDetails> flightDetailsList = flightDetailsService.getAllFlightDetails();
        return new ResponseEntity<>(flightDetailsList, HttpStatus.OK);
    }@GetMapping("/from-to/{fromLocation}/{toLocation}")
    public ResponseEntity<Optional<FlightDetails>> findFromTO(@PathVariable String fromLocation, @PathVariable String toLocation) {
        Optional<FlightDetails> flightDetails = flightDetailsService.findFromTo(fromLocation, toLocation);
        if (flightDetails.isPresent()) {
            return new ResponseEntity<>(flightDetails, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<FlightDetails> getFlightDetailsById(@PathVariable int id) {
        return flightDetailsService.getFlightDetailsById(id)
                .map(flightDetails -> new ResponseEntity<>(flightDetails, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<FlightDetails> createFlightDetails(@RequestBody FlightDetails flightDetails) {
        FlightDetails savedFlightDetails = flightDetailsService.saveFlightDetails(flightDetails);
        return new ResponseEntity<>(savedFlightDetails, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFlightDetailsById(@PathVariable int id) {
        flightDetailsService.deleteFlightDetailsById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
