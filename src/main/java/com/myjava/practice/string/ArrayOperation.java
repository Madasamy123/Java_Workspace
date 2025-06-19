package com.myjava.practice.string;

public class ArrayOperation {
    public int getValue(int[] arr, int i) {
        if(i>=arr.length){
            throw new ArrayIndexOutOfBoundsException("Index out of Bound");
        }
        return arr[i];
    }
}
