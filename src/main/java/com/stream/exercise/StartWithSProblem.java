package com.stream.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartWithSProblem {
    public static void main(String[] args) {

        List<String> buildingNames= Arrays.asList("saravana","sankar","suresh","madasamy","anand","samar");

        buildingNames.stream().filter(n->n.startsWith("s")).forEach(System.out::println);


    }
}
