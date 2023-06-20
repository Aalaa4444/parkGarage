package com.company;

import java.time.Duration;
import java.time.Instant;

public class CalculateFees {
    public double calculateFees(Instant arrTime, Instant endTime)
    {
        Duration timeElapsed = Duration.between(arrTime, endTime);
        double many=(((timeElapsed.toMillis())*60*1000)*5);
        return many;
    }

}
