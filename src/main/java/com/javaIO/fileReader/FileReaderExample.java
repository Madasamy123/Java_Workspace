package com.javaIO.fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderExample  {
    public static void main(String[] args) throws IOException {

        Reader fileReader=new FileReader("text.txt");
        int i=0;
        while((i=fileReader.read())!=-1){
            System.out.println((char)i);
        }
        System.out.println("read successfully");
        fileReader.close();
    }
}
