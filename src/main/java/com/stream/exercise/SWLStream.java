package com.stream.exercise;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SWLStream {
    public static void main(String[] args) {

        String sentence="I am madasamy. From Tirunelveli. Compledted Diploma";

        String[] sentenceCount=sentence.split("\\.");


        long sentCount=Arrays.stream(sentenceCount).count();
        System.out.println(sentCount);


        //


        String [] words=sentence.split(" ");
        long wordsCount= Arrays.stream(words).count();
        System.out.println(wordsCount);

//

        long lettersCount= sentence.chars()
                        .filter(Character::isLetter)
                                .count();
        System.out.println(lettersCount);




    }
}
