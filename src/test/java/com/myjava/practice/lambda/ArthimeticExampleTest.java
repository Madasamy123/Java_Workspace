package com.myjava.practice.lambda;

import com.lambda.ArthimeticExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArthimeticExampleTest {

    @Test
    public void testAddition(){
        ArthimeticExample addition=(int a, int b)->a+b;
        Assertions.assertEquals(30,addition.calculate(10,20));

    }

    @Test
    public void testDivision(){
      ArthimeticExample division=(int a,int b) -> a/b;
      Assertions.assertEquals(10,division.calculate(1000,100));

    }
}
