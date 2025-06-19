package com.exercise;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String,Double> sensorData=new HashMap<>();
        sensorData.put("08.00 AM",28.5);
        sensorData.put("08.30 AM",29.5);
        sensorData.put("09.00 AM",25.5);
        sensorData.put("09.30 AM",26.5);
        sensorData.put("10.00 AM",27.5);

        for(Map.Entry<String,Double> entry:sensorData.entrySet()){
            System.out.println("Time: "+entry.getKey()+" "+"Temperature: "+entry.getValue());
        }


    }
}
