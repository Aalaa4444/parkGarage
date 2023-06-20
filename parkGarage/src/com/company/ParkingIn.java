package com.company;

import java.time.Instant;

public class ParkingIn {
    private Instant arrivalTime;
    private ParkMethod pmethod;

    public ParkingIn() {
    }

    public Instant getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Instant arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setPmethod(ParkMethod pmethod) {
        this.pmethod = pmethod;
    }
}
