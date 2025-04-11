package com.atcsystem.models.flights;

import java.time.LocalDateTime;
import java.util.List;

import com.atcsystem.models.aircraft.Aircraft;
public class Flight {
    private final String flightNumber;
    private Aircraft aircraft;
    private String originCountry;
    private String destination;
    private LocalDateTime scheduledDeparture;
    private LocalDateTime estimatedArrival;
    private List<Position> route;
    private FlightStatus status;

    public Flight(String flightNumber,  Aircraft aircraft, String originCountry, String destination, LocalDateTime scheduledDeparture, LocalDateTime estimatedArrival, List<Position> route, FlightStatus status) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.originCountry = originCountry;
        this.destination = destination;
        this.scheduledDeparture = scheduledDeparture;
        this.estimatedArrival = estimatedArrival;
        this.route = route;
        this.status = status;
    }

    //Getters and Setters
    public String getFlightNumber() {return flightNumber;}
    public Aircraft getAircraft() {return aircraft;}
    public void setAircraft(Aircraft aircraft) {this.aircraft = aircraft;}
    public String getOriginCountry() {return originCountry;}
    public void setOriginCountry(String originCountry) {this.originCountry = originCountry;}
    public String getDestination() {return destination;}
    public void setDestination(String destination) {this.destination = destination;}
    public LocalDateTime getScheduledDeparture() {return scheduledDeparture;}
    public void setScheduledDeparture(LocalDateTime scheduledDeparture) {this.scheduledDeparture = scheduledDeparture;}
    public LocalDateTime getEstimatedArrival() {return estimatedArrival;}
    public void setEstimatedArrival(LocalDateTime estimatedArrival) {this.estimatedArrival = estimatedArrival;}
    public List<Position> getRoute() {return route;}
    public void setRoute(List<Position> route) {this.route = route;}
    public FlightStatus getStatus() {return status;}
    public void setStatus(FlightStatus status) {this.status = status;}

    

}
