package com.myjava.practice.testPractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringClassTest {

    @Test

    void equalString(){
        String name="Madasamy";
        Assertions.assertEquals("Madasamy",name);
    }
}
