package com.temperaturedata;


import com.temperaturedata.beans.*;

import java.io.*;


public class TemperatureClass {
    public void writeLocations(String fileName,Location location)  {
//        Temperature_sensor tempSensor = new Temperature_sensor(25);

//        Sensor humidity = new Humidity(16);
//        System.out.println(tempSensor.getReading());
//        System.out.println(tempSensor.getReading(ReadingUnit.F));
//        System.out.println(humidity.getReading());
//        System.out.println(humidity.getReading(ReadingUnit.K));
//
//
//        System.out.println(tempSensor.getClass());
//        System.out.println(tempSensor.hashCode());
//        System.out.println(tempSensor.toString());
//
//        Temperature_sensor temperature = new Temperature_sensor(25);
//        System.out.println(temperature.getClass());
//        System.out.println(temperature.hashCode());
//        System.out.println(temperature.toString() );
//        System.out.println(temperature.equals(tempSensor));


//        //  Organization
//

        Organization organization=new Organization();
        organization.setName("Madasamy Technology");
        organization.setCeo("Madasamy");
        organization.setEmail("madasamy@gmail.com");
        organization.setPhone("9876545673");


        try{
            FileOutputStream outputStream=new FileOutputStream("MadasamyTechnology.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(organization);
            objectOutputStream.close();

            FileInputStream fileInputStream=new FileInputStream("MadasamyTechnology.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            Organization myOrg=(Organization) objectInputStream.readObject();
            System.out.println(myOrg);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

//   Location

        Location location=new Location();
        location.setArea("Pirancheri");
        location.setCity("Town");
        location.setDistrict("Tirunelveli");
        location.setPincode("627451");


        try{
            FileOutputStream outputStream =new FileOutputStream("Location.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(location);
            objectOutputStream.close();

            FileInputStream fileInputStream=new FileInputStream("Location.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            Location myOrg=(Location) objectInputStream.readObject();
            System.out.println(myOrg);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        // Location =  2

        Location location2=new Location();
        location2.setArea("Perungudi");
        location2.setCity("Guindy");
        location2.setDistrict("Chennai");
        location2.setPincode("621 001");


        try{
            FileOutputStream outputStream =new FileOutputStream("SecondLocation.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(location2);
            objectOutputStream.close();

            FileInputStream fileInputStream=new FileInputStream("SecondLocation.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            Location myOrg=(Location) objectInputStream.readObject();
            System.out.println(myOrg);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        // Building




    }


}
