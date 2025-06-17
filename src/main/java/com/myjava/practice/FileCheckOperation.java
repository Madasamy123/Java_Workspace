package com.myjava.practice;

import java.io.FileWriter;
import java.io.IOException;

public class FileCheckOperation {
    public void fileMethod(String file, String s) throws IOException {

        FileWriter fileWriter=new FileWriter("text.txt");
        fileWriter.write(s);
        fileWriter.close();

    }
}
