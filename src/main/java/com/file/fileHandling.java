package com.file;

import java.io.File;
import java.io.IOException;

public class fileHandling {
    public static void main(String[] args) throws IOException {

        File myFile=new File("sample.xml");
        System.out.println(myFile.isFile());
        System.out.println(myFile.getAbsoluteFile());
        System.out.println(myFile.getCanonicalFile());
        System.out.println(myFile.getParentFile());
        System.out.println(myFile.canExecute());
        System.out.println(myFile.canRead());
        System.out.println(myFile.canWrite());
        System.out.println("create new file");
        System.out.println(myFile.createNewFile());
        System.out.println(myFile.delete());
        System.out.println(myFile.exists());

    }






}
