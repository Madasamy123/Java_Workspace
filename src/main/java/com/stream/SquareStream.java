package com.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SquareStream {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};

         IntStream squareStream= Arrays.stream(arr);
        squareStream.map(num->num*num).filter(n->n>10).forEach(System.out::println);

    }
}
