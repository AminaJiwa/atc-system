package com.atcsystem.models.aircraft;

import java.time.LocalDateTime;

import com.atcsystem.models.flights.Position;

public class Aircraft {

    private String registrationNumber;
    private String airline;
    private String iata;
    private String icao;
    private boolean isOnGround;
    private double latitude;
    private double longitude;
    private double altitude;
    private double direction;
    private double speedHorizontal;
    private double speedVertical;
    private FlightPhase flightPhase;

    public Aircraft(String registrationNumber, String airline, String iata, String icao, boolean isOnGround, 
    double latitude, double longitude, double altitude, double direction, double speedHorizontal, double speedVertical,
    FlightPhase flightPhase) 
    {
        this.registrationNumber = registrationNumber;
        this.airline = airline;
        this.iata = iata;
        this.icao = icao;
        this.isOnGround = isOnGround;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.direction = direction;
        this.speedHorizontal = speedHorizontal;
        this.speedVertical = speedVertical;
        this.flightPhase = flightPhase;

    }
    
    //Setters and getters
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getAirline() {
        return airline;
    }   

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getIata() {
        return iata;
    }   

    public void setIata(String iata) {   
        this.iata = iata;
    }

    public String getIcao() {   
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public boolean isOnGround() {
        return isOnGround;
    }

    public void setOnGround(boolean isOnGround) {
        this.isOnGround = isOnGround;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getAltitude() {
        return altitude;
    }   

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public double getSpeedHorizontal() {
        return speedHorizontal;
    }

    public void setSpeedHorizontal(double speedHorizontal) {
        this.speedHorizontal = speedHorizontal;
    }

    public double getSpeedVertical() {
        return speedVertical;
    }

    public void setSpeedVertical(double speedVertical) {
        this.speedVertical = speedVertical;
    }

    public FlightPhase getFlightPhase() {
        return flightPhase;
    }

    public void setFlightPhase(FlightPhase flightPhase) {
        this.flightPhase = flightPhase;
    }

    //Functions 
    public void changePhase(FlightPhase currentFlightPhase, FlightPhase newFlightPhase) {
        if (isValidTransition(currentFlightPhase, newFlightPhase)) {
            this.flightPhase = newFlightPhase;
        }
        else {
            throw new IllegalStateException("Invalid phase transition");
        }

    }

    private boolean isValidTransition(FlightPhase currentPhase, FlightPhase newPhase) {

        return switch(currentPhase) {
            case PARKED -> newPhase == FlightPhase.TAXIING;
            case TAXIING -> newPhase == FlightPhase.TAKEOFF || newPhase == FlightPhase.PARKED;
            case TAKEOFF -> newPhase == FlightPhase.CLIMBING || newPhase == FlightPhase.EMERGENCY;
            case CLIMBING -> newPhase == FlightPhase.CRUISING || newPhase == FlightPhase.DIVERTING || newPhase == FlightPhase.EMERGENCY;
            case CRUISING -> newPhase == FlightPhase.DESCENDING || newPhase == FlightPhase.CLIMBING || newPhase == FlightPhase.DIVERTING || newPhase == FlightPhase.EMERGENCY;
            case DESCENDING -> newPhase == FlightPhase.LANDING || newPhase == FlightPhase.CRUISING || newPhase == FlightPhase.DIVERTING || newPhase == FlightPhase.EMERGENCY;
            case LANDING -> newPhase == FlightPhase.TAXIING;
            case DIVERTING -> newPhase == FlightPhase.CLIMBING || newPhase == FlightPhase.CRUISING || newPhase == FlightPhase.DESCENDING || newPhase == FlightPhase.EMERGENCY;
            case EMERGENCY -> newPhase == FlightPhase.TAXIING;
            default -> true;
        };
    }

    //Create position snapshot
    public Position createPositionSnapshot() {
        return new Position(
            this.latitude,
            this.longitude,
            this.altitude,
            LocalDateTime.now(),
            this.speedHorizontal,
            this.direction
        );
    }

}
