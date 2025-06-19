package com.temperaturedata.beans;

import com.ExceptionHandling.BuildingFloorException;

import java.util.List;

public abstract sealed class Building permits Commercial, Residential {
    private List<Floor> floor;
    private String colour;
    private String shape;
    private String name;
    private int bulidingNumber;
    private int noOfFloors;
    private double height;
    private double squareFeet;
    private Boolean parkingAvailable;
    public abstract void ebBill();


//    public Floor[] getFloors() {
//        return floors;
//    }
//
//    public void setFloors(Floor[] floors) {
//
//        this.floors = floors;
//    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBulidingNumber() {
        return bulidingNumber;
    }

    public void setBulidingNumber(int bulidingNumber) {
        this.bulidingNumber = bulidingNumber;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public void setNoOfFloors(int noOfFloors) throws BuildingFloorException {
        if(noOfFloors>100){

                throw new BuildingFloorException("Out of  Floors in Buildings");

        }
        this.noOfFloors = noOfFloors;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(double squareFeet) {
        this.squareFeet = squareFeet;
    }

    public Boolean getParkingAvailable() {
        return parkingAvailable;
    }

    public void setParkingAvailable(Boolean parkingAvailable) {
        this.parkingAvailable = parkingAvailable;
    }
}
