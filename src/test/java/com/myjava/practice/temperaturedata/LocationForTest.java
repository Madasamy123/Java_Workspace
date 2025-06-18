package com.myjava.practice.temperaturedata;

import com.temperaturedata.TemperatureClass;
import com.temperaturedata.beans.Location;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LocationForTest {
    @Test

    public void testLocation() throws IOException, ClassNotFoundException {


        Location location=new Location();
        location.setArea("Pirancheri");
        location.setCity("Town");
        location.setDistrict("Tirunelveli");
        location.setPincode("627451");

        Location location2=new Location();
        location2.setArea("Perungudi");
        location2.setCity("Guindy");
        location2.setDistrict("Chennai");
        location2.setPincode("621 001");

// file 1

        TemperatureClass temperatureClass=new TemperatureClass();
        temperatureClass.writeLocations("Nellai.txt",location);
        File myFile=new File("Nellai.txt");
        Assertions.assertTrue(myFile.exists());

        FileInputStream fileInputStream=new FileInputStream("Nellai.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Location location3=(Location) objectInputStream.readObject();
        Assertions.assertEquals(location.getDistrict(),location3.getDistrict());



        // file 2

        temperatureClass.writeLocations("Chennai.txt",location2);
        File myFile2=new File("Chennai.txt");
        Assertions.assertTrue(myFile2.exists());

        fileInputStream=new FileInputStream("Chennai.txt");
        objectInputStream=new ObjectInputStream(fileInputStream);
        Location location4=(Location) objectInputStream.readObject();
        Assertions.assertEquals(location2.getDistrict(),location4.getDistrict());




    }
}
