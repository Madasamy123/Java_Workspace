package com.collections;

import java.util.HashSet;
import java.util.Set;

public class SetOperation {
    public static void main(String[] args) {
        Set<Integer>arr1=new HashSet<>();
        Set<Integer>arr2= Set.of(30,40,50,20,80);

        arr1.add(10);
        arr1.add(40);
        arr1.add(70);
        arr1.add(90);
        arr1.add(20);

        Set<Integer>addSet=new HashSet<>();
        addSet.addAll(arr1);
        addSet.addAll(arr2);
        arr1.retainAll(arr2);
        addSet.removeAll(arr1);

        System.out.println(addSet);




//        arr1.addAll(arr2);
//
//        System.out.println(arr1);

//        arr1.retainAll(arr2);
//        System.out.println(arr1);








    }
}
