package com.stream.exercise;

// Write a program to find the words in a given sentence

import java.util.Arrays;
import java.util.stream.Stream;

public class WordsStream {
    public static void main(String[] args) {

        String  sentence ="This is Ourkadai Technology from Madurai";

        String [] splitWord =sentence.split(" ");

        Stream<String> words=Arrays.stream(splitWord);

        words.forEach(System.out::println);




    }
}
