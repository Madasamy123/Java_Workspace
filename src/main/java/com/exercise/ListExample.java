package com.exercise;


//  Create a list of marks and sort them in ascending and descending order

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> marksList=new ArrayList<>();
        marksList.add(70);
        marksList.add(87);
        marksList.add(45);
        marksList.add(67);
        marksList.add(76);
        marksList.add(55);

        // ascending order

        marksList.sort(Comparator.naturalOrder());
        System.out.println(marksList);

        // Desending order

        marksList.sort(Comparator.reverseOrder());
        System.out.println(marksList);

        // Highest Mark

        int hightestMark= Collections.max(marksList);
        System.out.println(hightestMark);

    }
}
