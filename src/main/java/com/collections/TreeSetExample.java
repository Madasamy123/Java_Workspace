package com.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> names=new TreeSet<>(Comparator.reverseOrder());
        names.add("Madasamy");
        names.add("Shobhan");
        names.add("Keerthana");
        names.add("Sathashini");



        System.out.println(names);
    }
}
