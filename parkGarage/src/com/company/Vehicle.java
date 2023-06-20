package com.company;

import java.time.Instant;

public class Vehicle {
    private String modelname;
    private int uniqueID;
    private int modelYear;
    private Instant arrivalTime;
    private int width;
    private int depth;

    public Vehicle(int uniqueID, String modelname, int modelYear, Instant arrivalTime, int d , int w)
    {

        depth=d;
        width=w;
        this.uniqueID = uniqueID;
        this.modelname = modelname;
        this.modelYear = modelYear;
        this.arrivalTime = arrivalTime;
        //this.modelYear = modelYear;
    }


    public String getModelname() {
        return modelname;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public int getModelYear() {
        return modelYear;
    }

    public Instant getArrivalTime() {
        return arrivalTime;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

}
