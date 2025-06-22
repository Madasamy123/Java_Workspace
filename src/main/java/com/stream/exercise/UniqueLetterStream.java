package com.stream.exercise;

import java.util.stream.IntStream;

public class UniqueLetterStream {
    public static void main(String[] args) {

        String  sentence ="This is Ourkadai Technology from Madurai";

        String words=sentence.replace(" ","");

        IntStream unique=words.chars();
        unique.mapToObj(letters->(char)letters).distinct().forEach(System.out::println);

    }
}
