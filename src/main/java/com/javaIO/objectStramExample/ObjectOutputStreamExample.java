package com.javaIO.objectStramExample;

import java.io.*;

public class ObjectOutputStreamExample {

    public static void main(String[] args) throws IOException {
        // Create a Student object
        Student s1 = new Student(101, "Madasamy");

        // Serialize to file
        FileOutputStream fos = new FileOutputStream("maddy.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s1);  // Serialize the object
        oos.close();
        fos.close();

        System.out.println(" Object written to file (student.ser)");
    }
}
