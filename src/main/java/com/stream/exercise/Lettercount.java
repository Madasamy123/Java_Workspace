package com.stream.exercise;
// write a program to find the number of letters in the given sentence without space

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lettercount {
    public static void main(String[] args) {

        String  sentence ="This is Ourkadai Technology from Madurai";

        String charLetters=sentence.replace(" ","");

        IntStream charCount=charLetters.chars();

        System.out.println(charCount.count());

    }
}
