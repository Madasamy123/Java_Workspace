package com.stream.exercise;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class tempStream {
    public static void main(String[] args) {

        Map<LocalTime, Double> tempValue= new HashMap();
        tempValue.put(LocalTime.of(8,30,20),22.5);
        tempValue.put(LocalTime.of(9,00,20),23.5);
        tempValue.put(LocalTime.of(9,30,30),24.5);
        tempValue.put(LocalTime.of(10,00,30),22.5);

        System.out.println(Stream.of(tempValue).toList())

        ;
    }
}
