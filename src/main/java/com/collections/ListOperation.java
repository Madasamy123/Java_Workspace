package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListOperation {

    public static void main(String[] args) {
        List<String> studentNames=new ArrayList<>();
        studentNames.add("Madasamy");
        studentNames.add("Shobhan");
        studentNames.add("Keerthana");
        studentNames.add("Sathasini");





        System.out.println(studentNames);

        System.out.println(studentNames.contains("Madasamy"));


        System.out.println(studentNames.isEmpty());

        studentNames.add(0,"Raja Sir");

        System.out.println(studentNames);

        System.out.println(studentNames.reversed());

        studentNames.forEach(System.out::println);

    }
}
