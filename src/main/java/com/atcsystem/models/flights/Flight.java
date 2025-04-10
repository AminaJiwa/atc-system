package com.atcsystem.models.flights;

import com.atcsystem.models.aircraft.Aircraft;
import java.time.LocalDateTime;
import java.util.List;
public class Flight {
    private final String flightNumber;
    private Aircraft aircraft;
    private String originCountry;
    private String destination;
    private LocalDateTime scheduledDeparture;
    private LocalDateTime estimatedArrival;
    //private List<Position> route;
    private FlightStatus status;

    public Flight(String flightNumber,  Aircraft aircraft, String originCountry, String destination, LocalDateTime scheduledDeparture, LocalDateTime estimatedArrival, List<Position> route, FlightStatus status) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.originCountry = originCountry;
        this.destination = destination;
        this.scheduledDeparture = scheduledDeparture;
        this.estimatedArrival = estimatedArrival;
        //this.route = route;
        this.status = status;
    }


}
