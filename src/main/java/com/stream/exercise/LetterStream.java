package com.stream.exercise;

// Write a program to find the letters in the given sentence.

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LetterStream {
    public static void main(String[] args) {

        String  sentence ="This is Ourkadai Technology from Madurai";

        String letters=sentence.replace(" ","");

        IntStream charStream=letters.chars();



        charStream.mapToObj(ch->(char)ch).forEach(System.out::println);



    }
}
