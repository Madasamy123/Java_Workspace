package assessment;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your sensor name: ");
        String sname=scn.nextLine();

        System.out.println("Enter your temperature in your " +sname+ "sensor");

        float temp=scn.nextFloat();

        System.out.println("Sensor: "+sname+"Temperature: "+temp);

scn.close();

    }
    
}
