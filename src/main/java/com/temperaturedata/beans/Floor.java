package com.temperaturedata.beans;

import java.util.List;
import java.util.Set;

public class Floor {
    private Set<Zone> zone;

    private String name;
    private int noOfZone;
    private int floorNumber;

    public Set<Zone> getZone() {
        return zone;
    }

    public void setZone(Set<Zone> zone) {
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
