package com.stream;

//Create a name list of marks and sort them in ascending and descending order

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MarkStream {
    public static void main(String[] args) {

        Integer [] marks={67,87,65,98,79,59};
//  ascending marks
        Stream <Integer> ascMarks=Arrays.stream(marks);
                 ascMarks
                .sorted()
                .forEach(System.out::println);
// Desending marks

        Stream <Integer> descMarks=Arrays.stream(marks);
                 descMarks
                .sorted((a,b)->b-a)
                         .forEach(System.out::println);








    }
}
