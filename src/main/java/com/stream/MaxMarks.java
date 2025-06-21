package com.stream;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// From the mark list find the highest mark
public class MaxMarks {
    public static void main(String[] args) {
        Integer [] marks={78,65,98,82,56};

        Stream <Integer> highMarks= Arrays.stream(marks);
        System.out.println(highMarks.max(Integer::compare).get());

    }
}
