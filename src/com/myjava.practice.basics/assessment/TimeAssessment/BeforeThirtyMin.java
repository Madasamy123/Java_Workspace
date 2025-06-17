
//  Write a program to find the time before 30 minutes

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BeforeThirtyMin {
    public static void main(String [] args){

        LocalTime today= LocalTime.now();  // current time

       
       
        LocalTime beforeThirtyMin=today.minusMinutes(30);


        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
        
        System.out.println("Current Time: "+today.format(formatter));
        System.out.println("Before 30 min: "+beforeThirtyMin.format(formatter));

    }

}
