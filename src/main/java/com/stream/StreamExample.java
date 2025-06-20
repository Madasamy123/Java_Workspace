package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Integer [] numbers={1,2,3,4,5,6,7,8};

        Stream<Integer> numberStream= Arrays.stream(numbers);
        numberStream.filter(number->number%2==0).
                forEach(System.out::println);



    }
}
