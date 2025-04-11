package com.atcsystem.models.flights;

import java.time.LocalDateTime;
public class Position {
    private final double latitude;
    private final double longitude;
    private final double altitude;
    private final LocalDateTime timestamp;
    private final double groundSpeed;
    private final double heading;

    //Constructor
    public Position(double latitude, double longitude, double altitude, LocalDateTime timestamp, 
    double groundSpeed, double heading) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.timestamp = timestamp;
        this.groundSpeed = groundSpeed;
        this.heading = heading;
    }

    //Constructor without speed and heading
    public Position(double latitude, double longitude, double altitude, LocalDateTime timestamp) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.timestamp = timestamp;
        this.groundSpeed = 0.0;
        this.heading = 0.0;
    }

    //Getters
    public double getLatitude() {return latitude;}
    public double getLongitude() {return longitude;}
    public double getAltitude() {return altitude;}
    public LocalDateTime getTimestamp() {return timestamp;}
    public double getGroundSpeed() {return groundSpeed;}
    public double getHeading() {return heading;}

    @Override
    public String toString() {
        return String.format("Position[%.6f°N, %.6f°E, %.0fft, %s, %.0fkts, %.0f°]", latitude,
        longitude, altitude, timestamp, groundSpeed, heading);
    };
}

