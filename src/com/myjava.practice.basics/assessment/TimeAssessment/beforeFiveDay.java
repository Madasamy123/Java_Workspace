//  Write a program to find the date 5 days ago

import java.time.LocalDate;

public class beforeFiveDay {
    public static void main(String[] args) {
        
        LocalDate today=LocalDate.now();

        LocalDate beforeFiveDay=today.minusDays(5);

        System.out.println(beforeFiveDay);
    

    }

}
