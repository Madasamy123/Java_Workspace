package com.myjava.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileCheckOperationTest {
     @Test
    public void checkFile() throws IOException {

        FileCheckOperation fileCheckOperation= new FileCheckOperation();
        fileCheckOperation.fileMethod("text.txt","I am madasamy from Tirunelveli");

        File myFile=new File("text.txt");
        Assertions.assertTrue(myFile.exists());
        FileReader fileReader=new FileReader(myFile);
        char[]content = new char[30];
        fileReader.read(content);
        System.out.println(content);
        System.out.println(content.length);
        Assertions.assertEquals("I am madasamy from Tirunelveli",String.valueOf(content));

    }
}
