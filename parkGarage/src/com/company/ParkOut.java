package com.company;

import java.time.Instant;

public class ParkOut extends CalculateFees{
    private Instant endTime;

    public void setEndTime(Instant endTime) {
        this.endTime = endTime;
    }
}
