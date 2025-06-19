package com.collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
       Queue<Integer> addmissionNo = new LinkedList<>();
       addmissionNo.add(100);
       addmissionNo.add(200);
       addmissionNo.add(300);
       addmissionNo.add(400);

//        System.out.println(addmissionNo);
//        addmissionNo.remove();
//        System.out.println(addmissionNo);
//        addmissionNo.add(500);
//        System.out.println(addmissionNo);

        Integer rollNo=addmissionNo.poll();
        while(rollNo!=null){
            System.out.println(rollNo);
            rollNo=addmissionNo.poll();

        }



        };
    }

