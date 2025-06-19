package com.temperaturedata.beans;

import java.util.List;

public class Floor {
    private List<Zone> zone;

    private String name;
    private int noOfZone;
    private int floorNumber;

    public List<Zone> getZone() {
        return zone;
    }

    public void setZone(List<Zone> zone) {
        this.zone = zone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfZone() {
        return noOfZone;
    }

    public void setNoOfZone(int noOfZone) {
        this.noOfZone = noOfZone;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}
