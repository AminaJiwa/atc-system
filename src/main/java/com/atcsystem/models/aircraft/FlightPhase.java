package com.atcsystem.models.aircraft;

public enum FlightPhase {
    PARKED("On ground at gate"),
    TAXIING("Moving on taxiways"),
    TAKEOFF("Taking off"),
    CLIMBING("Ascending to cruise altitude"),
    CRUISING("At level flight"),
    DESCENDING("Approaching destination"),
    LANDING("Final approach/landing"),
    DIVERTING("Diverting"),
    EMERGENCY("Emergency landing");


    private final String description;

    FlightPhase(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
