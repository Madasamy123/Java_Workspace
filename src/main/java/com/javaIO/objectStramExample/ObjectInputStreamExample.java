package com.javaIO.objectStramExample;

import java.io.*;

public class ObjectInputStreamExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Read serialized object from file
        FileInputStream fis = new FileInputStream("maddy.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s = (Student) ois.readObject();  // Deserialize the object

        ois.close();
        fis.close();

        System.out.println(" Object read from file:");
        System.out.println("ID: " + s.id);
        System.out.println("Name: " + s.name);
    }
}
