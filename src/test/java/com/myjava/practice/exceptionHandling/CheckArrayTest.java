package com.myjava.practice.exceptionHandling;

import com.myjava.practice.string.ArrayOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckArrayTest {
//    @Test
//    public  void checkEmpty(){
//
//        ArrayOperation arrayException=new ArrayOperation();
//
//        int [] arr=new int[0];
//
//        Assertions.assertEquals(0,arr.length);
//
//
//    }

    @Test
    public void arrayCheck(){
        ArrayOperation arrayOperation=new ArrayOperation();
        int [] arr={10,20,30,40,50};
        int i=2;
        int result= arrayOperation.getValue(arr,i);
        Assertions.assertEquals(30,result);

        i=3;
        result=arrayOperation.getValue(arr,i);

        Assertions.assertEquals(40,result);
        i=5;
        try{
            result=arrayOperation.getValue(arr,i);
            Assertions.fail();

        } catch (ArrayIndexOutOfBoundsException e) {
           Assertions.assertNotNull(e);
           Assertions.assertEquals("Index out of Bound",e.getMessage());



        }



    }

}
