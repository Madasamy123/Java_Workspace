package com.temperatureData.beans;

import java.util.List;

public class Zone {
    private List<TemperatureSensor> temperatureSensor;
    private String name;
    private int zoneNumber;
    private int noOfZone;
    private int noOfSensor;

    public List<TemperatureSensor> getTemperatureSensor() {
        return temperatureSensor;
    }

    public void setTemperatureSensor(List<TemperatureSensor> temperatureSensor) {
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
