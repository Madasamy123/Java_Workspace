package com.temperatureData;

import com.temperatureData.beans.*;

import java.util.*;


public class TemperatureClass {
    public static void main(String[] args) {

        //  organization

        Organization organization = new Organization();
        organization.setName("Madasamy Technology");
        organization.setCeo("Madasamy");
        organization.setEmail("madasamy@gmail.com");
        organization.setPhone("9876545673");

       //  locations

        Location chennai = createLocation("123", "AbdulKalam Street", "Guindy", "Chennai", "TamilNadu");
        Location coimbatore = createLocation("45", "mgr street", "porur", "Coimbatore", "TamilNadu");

        List<Location> locationList = new ArrayList<>();
        locationList.add(chennai);
        locationList.add(coimbatore);

        organization.setLocation(locationList);


        // Buildings

        Commercial Navigator=createBuilding(2,"Navigator","Blue",25.4);
        Commercial creator=createBuilding(3,"Creator","Red",34.5);
        Commercial Inventor=createBuilding(4,"Inventor","Yellow",34.5);
        Commercial Innovator=createBuilding(5,"Innovator","Orange",54.6);


        Set<Building>chennaiBuildings=new TreeSet<>();
        chennaiBuildings.add(Navigator);
        chennaiBuildings.add(creator);

        chennai.setBuildings(chennaiBuildings);

        Set<Building>cbmBuildings=new TreeSet<>();
        cbmBuildings.add(Innovator);
        cbmBuildings.add(Inventor);

        coimbatore.setBuildings(cbmBuildings);


        // floors


        Floor navigatorFloor=createFloor(1,"FirstFloor",2);
        Floor navigatorFloor1=createFloor(2,"Second Floor",2);

        Set<Floor> floorsList=Set.of(navigatorFloor,navigatorFloor1);
        Navigator.setFloor((TreeSet<Floor>) floorsList);


        Floor creatorFloor=createFloor(3,"FirstFloor",2);
        Floor creatorFloor1=createFloor(4,"Second Floor",2);

        Set<Floor> creators=Set.of(creatorFloor,creatorFloor1);
        creator.setFloor((TreeSet<Floor>) creators);

        //  zones

        Zone zoze1=createZones("Work Zone",121,3,2);
        Zone zone2=createZones("Meeting zone",122,2,2);

        Set<Zone> zones=Set.of(zoze1,zone2);
        creatorFloor.setZone(zones);

        // sensors















    }



    public static Location createLocation(String doorNo, String street, String city, String district, String state) {
        Location location = new Location();
        location.setDoorNo(doorNo);
        location.setStreet(street);
        location.setCity(city);
        location.setDistrict(district);
        location.setState(state);

        return location;
    }


    public static Commercial createBuilding(int buildingNumber,String name,String colour,double height)  {

        Commercial commercial=new Commercial();
        commercial.setBulidingNumber(buildingNumber);
        commercial.setName(name);
        commercial.setColour(colour);
        commercial.setHeight(height);

        return  commercial;

    }

    public static Floor createFloor(int floorNumber,String name,int noOfZone){
        Floor floor=new Floor();
        floor.setFloorNumber(floorNumber);
        floor.setName(name);
        floor.setNoOfZone(noOfZone);

        return floor;

    }

    public static Zone createZones(String name,int zoneNumber,int noOfZone,int noOfSensor){
        Zone zone=new Zone();
        zone.setName(name);
        zone.setZoneNumber(zoneNumber);
        zone.setNoOfZone(noOfZone);
        zone.setNoOfSensor(noOfSensor);

        return zone;
    }

//    public static Sensor createSensors(LocalTime aTime,float atemp) throws TemperatureRangeException {
//        Temperature_sensor temperature_sensor=new Temperature_sensor();
//        temperature_sensor.setTemp(23.5);
//    }



}





//    public static void main(String[] args) throws BuildingFloorException {
//        Residential residential = new Residential();
//        try {
//            residential.setNoOfFloors(150);
//        } catch (BuildingFloorException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}



    //  temperature range exception

//    public static void main(String[] args) throws TemperatureRangeException {
//        try {
//
//
//            Temperature_sensor temperature_sensor = new Temperature_sensor(45);
//            temperature_sensor = new Temperature_sensor(98);
//        } catch (TemperatureRangeException e) {
//            throw new RuntimeException(e);
//        }




//    public void writeLocations(String fileName,Location location) throws IOException {
//
//        try(FileOutputStream fileOutputStream=new FileOutputStream("chennai.txt")){
//            ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
//
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//
//        }

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
//
//        Organization organization=new Organization();
//        organization.setName("Madasamy Technology");
//        organization.setCeo("Madasamy");
//        organization.setEmail("madasamy@gmail.com");
//        organization.setPhone("9876545673");
//
//
//        try{
//            FileOutputStream outputStream=new FileOutputStream("MadasamyTechnology.txt");
//            ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
//            objectOutputStream.writeObject(organization);
//            objectOutputStream.close();
//
//            FileInputStream fileInputStream=new FileInputStream("MadasamyTechnology.txt");
//            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
//            Organization myOrg=(Organization) objectInputStream.readObject();
//            System.out.println(myOrg);
//
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//   Location
//
//        Location location=new Location();
//        location.setArea("Pirancheri");
//        location.setCity("Town");
//        location.setDistrict("Tirunelveli");
//        location.setPincode("627451");


//        try{
//        FileOutputStream outputStream = new FileOutputStream(fileName);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//        objectOutputStream.writeObject(location);
//        objectOutputStream.close();


//            FileInputStream fileInputStream=new FileInputStream("Location.txt");
//            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
//            Location myOrg=(Location) objectInputStream.readObject();
//            System.out.println(myOrg);


//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        // Location =  2

//        Location location2=new Location();
//        location2.setArea("Perungudi");
//        location2.setCity("Guindy");
//        location2.setDistrict("Chennai");
//        location2.setPincode("621 001");


//        try{
//            FileOutputStream outputStream =new FileOutputStream("SecondLocation.txt");
//            ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
//            objectOutputStream.writeObject(location2);
//            objectOutputStream.close();
//
//            FileInputStream fileInputStream=new FileInputStream("SecondLocation.txt");
//            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
//            Location myOrg=(Location) objectInputStream.readObject();
//            System.out.println(myOrg);
//
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }


        // Building




//    }
//
//
//}
