package com.stream.exercise;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MrMissStream {
    public static void main(String[] args) {
        String [] names={"Madasamy","keerthana","Shobhan","Shathashini"};

        IntStream.range(0, names.length)
                .mapToObj(i-> (i % 2==0 ? "Mr. ":"Miss. ")+names[i])
                .forEach(System.out::println);

    }
}
