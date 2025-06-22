package com.stream.exercise;

// Write a program to find the number of sentences in the given paragraph. use full stop as sentence splitter

import java.util.Arrays;

public class splitStreamExample {
    public static void main(String[] args) {

        String sentence="I am madasamy. From Tirunelveli. Compledted Diploma";

        String [] words=sentence.split("\\.");

        long count=Arrays.stream(words).count();
        System.out.println(count);


    }
}
