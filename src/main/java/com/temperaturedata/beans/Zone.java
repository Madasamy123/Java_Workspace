package com.temperaturedata.beans;

import java.util.List;
import java.util.Set;

public class Zone {
    private List<Temperature_sensor> temperatureSensor;
    private String name;
    private int zoneNumber;
    private int noOfZone;
    private int noOfSensor;

    public List<Temperature_sensor> getTemperatureSensor() {
        return temperatureSensor;
    }

    public void setTemperatureSensor(List<Temperature_sensor> temperatureSensor) {
        this.temperatureSensor = temperatureSensor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getZoneNumber() {
        return zoneNumber;
    }

    public void setZoneNumber(int zoneNumber) {
        this.zoneNumber = zoneNumber;
    }

    public int getNoOfZone() {
        return noOfZone;
    }

    public void setNoOfZone(int noOfZone) {
        this.noOfZone = noOfZone;
    }

    public int getNoOfSensor() {
        return noOfSensor;
    }

    public void setNoOfSensor(int noOfSensor) {
        this.noOfSensor = noOfSensor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;
}
