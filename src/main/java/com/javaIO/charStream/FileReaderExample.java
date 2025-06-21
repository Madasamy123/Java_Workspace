package com.javaIO.charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {

        FileReader fileReader=new FileReader("text.txt");
        int i = 0;

        while((i = fileReader.read())!= -1){
            System.out.println((char) i);
        }
    }
}
