package com.file;

import java.io.File;
import java.io.IOException;

public class fileHandling {
    public static void main(String[] args) throws IOException {

        File myFile=new File("text.txt");
        File newFile=new File("NewFile.txt");
        System.out.println(myFile.isFile());
        System.out.println(myFile.getParentFile());
        System.out.println(myFile.getPath());
        System.out.println(myFile.getAbsoluteFile());
        System.out.println(myFile.exists());
        System.out.println(myFile.getCanonicalFile());
        System.out.println(myFile.toURI());
        System.out.println(myFile.toURL());
        System.out.println(myFile.canRead());
        System.out.println(myFile.canWrite());
        System.out.println(myFile.canExecute());
        System.out.println(myFile.createNewFile());
//        System.out.println(myFile.delete());
        System.out.println(myFile.list());
//        System.out.println(myFile.mkdir());
        System.out.println(myFile.toPath());
        System.out.println(myFile.length());
//        System.out.println(myFile.renameTo(newFile));
        System.out.println(newFile.renameTo(myFile));


    }






}
