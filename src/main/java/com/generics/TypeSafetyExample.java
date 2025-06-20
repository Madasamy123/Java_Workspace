package com.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeSafetyExample {
    public static void main(String[] args) {

        List myList=new ArrayList<>();
        myList.add("Madasamy");
        myList.add(453);
        myList.add(45.34);

        System.out.println(myList);

        String name=(String) myList.get(0);
        System.out.println(name);

        Integer num= (Integer) myList.get(1);
        System.out.println(num);

        Double doubleValue= (Double) myList.get(2);
        System.out.println(doubleValue);



    }
}
