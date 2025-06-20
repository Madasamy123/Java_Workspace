package com.temperaturedata.beans;

import com.ExceptionHandling.TemperatureRangeException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Temperature_sensor implements Sensor{


    private float atemp;

    Map<LocalDateTime,Temperature> temperatureData;

    public float getTemp() {
        return atemp;
    }

    public void setTemp(float temp) {
        this.atemp = atemp;
    }

    public Map<LocalDateTime, Temperature> getTemperatureData() {
        return temperatureData;
    }

    public void setTemperatureData(Map<LocalDateTime, Temperature> temperatureData) {
        this.temperatureData = temperatureData;
    }

    public Temperature_sensor()throws TemperatureRangeException{

        if(atemp<-89 || atemp>58){
            throw new TemperatureRangeException("Out of Temperature Range");
        }
//        temp=atemp;
    }
    @Override
    public float getReading() {
        return atemp;
    }

    @Override
    public float getReading(ReadingUnit unit) {
        if(ReadingUnit.F.equals(unit) ){
            return (atemp*9/5)+32;
        }
        else{
            return atemp;
        }

    }

    @Override
    public String toString() {
        return "Temperature " + atemp;
    }

    @Override
    public int hashCode(){
        return (int)atemp*34;
    }

    @Override
    public boolean equals(Object temperature){
        Temperature_sensor myobj=(Temperature_sensor) temperature;


        if (super.equals((myobj))){
            return true;
        }
        else{
            return this.atemp == myobj.atemp;
        }


    }







}
