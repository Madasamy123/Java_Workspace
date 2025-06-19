package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableExample {
    public static void main(String[] args) {

        List<String> studentNames = new ArrayList<>();
        studentNames.add("Madasamy");
        studentNames.add("Shobhan");
        studentNames.add("Keerthana");
        studentNames.add("Sathasini");

        Iterator<String> namesIterator = studentNames.iterator();

        while (namesIterator.hasNext()) {
            String name = namesIterator.next();
            if (name.equals("Shobhan")) {
                namesIterator.remove();
            }
        }

        System.out.println(studentNames);
    }
}
