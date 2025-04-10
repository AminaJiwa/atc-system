package com.atcsystem.models.flights;

public enum FlightStatus {
    //Each enum values has a string description 
    SCHEDULED("Scheduled"),
    BOARDING("Passengers boarding"),
    PUSHBACK("Has left gate, taxiing"),
    DEPARTED("Airborne"),
    ENROUTE("Cruising"),
    DIVERTED("Changed route"),
    LANDED("On ground at destination"),
    CANCELLED("Flight cancelled");

    private final String description;

    FlightStatus(String description) {
        this.description = description;
    }
}
