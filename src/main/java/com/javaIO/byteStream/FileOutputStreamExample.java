package com.javaIO.byteStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream=new FileOutputStream("text.txt");

        String data="I am madasamy from Tirunelveli";

        byte[] byteData=data.getBytes();

        fileOutputStream.write(byteData);

        fileOutputStream.close();

        System.out.println("Successfully write the file");


    }
}
