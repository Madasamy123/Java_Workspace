//package com.temperaturedata;
//
//
//import com.temperaturedata.beans.Organization;
//
//import java.io.*;
//
//public class TemperatureDataApp {
//
//
//    public static void main(String[] args) throws IOException {
//        Organization organization=new Organization();
//        organization.setName("Madasamy Technology");
//        organization.setCeo("Madasamy");
//        organization.setEmail("madasamy@gmail.com");
//        organization.getPhone("9876545673");
//
//
//        try{
//            FileOutputStream outputStream=new FileOutputStream("MadasamyTechnology.txt");
//            ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
//            objectOutputStream.writeObject(Organization);
//            objectOutputStream.close();
//
//            FileInputStream  fileInputStream=new FileInputStream("MadasamyTechnology.txt");
//            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
//            Organization myOrg=(Organization) objectInputStream.readObject();
//            System.out.println(myOrg);
//
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//}
