package com.myjava.practice.ExceptionHandling;

import com.myjava.practice.string.ArthimeticOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisibleTest {
    @Test
    public void checkDivisible(){

        ArthimeticOperation arthimeticOperation=new ArthimeticOperation();

        int a=10;
        int b=2;

        int result=arthimeticOperation.divisible(a,b);
        Assertions.assertEquals(5,result);



        a=15;
         b=0;

        try {
            result = arthimeticOperation.divisible(a, b);
            Assertions.fail();

        }
        catch(ArithmeticException e){
            Assertions.assertNotNull(e);
//            Assertions.assertEquals("Your Cannot divided By zero",e.getMessage());
        }

    }




}
