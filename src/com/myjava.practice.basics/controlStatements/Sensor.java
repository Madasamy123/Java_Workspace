import java.util.Scanner;

public class Sensor {

    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        int first=scn.nextInt();
        int second=scn.nextInt();
        int third=scn.nextInt();
        int fourth=scn.nextInt();
        int fifth=scn.nextInt();

        if(first>28){
            System.out.println("First Sensor is "+first+" greater than 28");
        }
         if(second>28){
            System.out.println("Second Sensor is "+second+" greater than 28");
        }
         if(third>28){
            System.out.println("Third Sensor is "+third+" greater than 28");
        }
         if(fourth>28){
            System.out.println("Fourth Sensor is"+fourth+" greater than 28");
        }
         if(fifth>28){
            System.out.println("Fifth Sensor is"+fifth+" greater than 28");
        }
        else{
            System.out.println("No Sensor greater than 28");
        }


    }
    
}
