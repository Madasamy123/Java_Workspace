package com.myjava.practice.string;

public class ArthimeticOperation {

    public int divisible(int a, int b) {
        if(b==0){
            throw new ArithmeticException("You can't divide numbere by 0");
        }
        return a/b;
    }
}
