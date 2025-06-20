package com.exercise;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<LocalTime,Double> sensorData=new HashMap<>();
        sensorData.put(LocalTime.of(8,00,00),28.5);
        sensorData.put(LocalTime.of(8,30,00),29.5);
        sensorData.put(LocalTime.of(9,00,00),25.5);
        sensorData.put(LocalTime.of(9,30,00),26.5);
        sensorData.put(LocalTime.of(10,00,00),27.5);

        for(Map.Entry<LocalTime,Double> entry:sensorData.entrySet()){
            System.out.println("Time: "+entry.getKey()+" "+"Temperature: "+entry.getValue());
        }


    }
}
