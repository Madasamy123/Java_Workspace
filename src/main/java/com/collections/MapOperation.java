package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapOperation {
    public static void main(String[] args) {
        Map<Integer,String> cseA=new TreeMap<>();
        cseA.put(100,"Madasamy");
        cseA.put(101,"Shobhan");
        cseA.put(102,"keerthana");
        cseA.put(103,"Sathashini");

//        System.out.println(cseA);


        Map<Integer,String> cseB=new HashMap<>();
        cseB.put(200,"Anand");
        cseB.put(201,"Suriya");
        cseB.put(202,"Muthu raj");
        cseB.put(203,"Sankar");

//        System.out.println(cseB);


        Map<Integer,String> mergeStudents=new TreeMap<>();
        mergeStudents.putAll(cseA);
        mergeStudents.putAll(cseB);

//        System.out.println(mergeStudents);
//        System.out.println(mergeStudents.keySet());
//        System.out.println(mergeStudents.values());

        Map<Integer,String> paidStudents=new TreeMap<>();
        paidStudents.put(101,"Shobhan");
        paidStudents.put(103,"Sathashini");

        mergeStudents.entrySet().removeAll(paidStudents.entrySet());

        System.out.println(mergeStudents);







    }
}

