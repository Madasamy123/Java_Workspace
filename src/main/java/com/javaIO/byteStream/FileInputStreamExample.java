package com.javaIO.byteStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("text.txt");
        int i;
        while((i = fis.read()) != -1) {
            System.out.print((char)i);
        }
        fis.close();

    }
}
