package com.javaIO.charStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("charFile");
        String content="Madurai is temple city";

        fileWriter.write(content);

        System.out.println("Successfull write");

        fileWriter.close();

    }
}
