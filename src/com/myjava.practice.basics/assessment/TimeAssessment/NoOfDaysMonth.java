// Write a program to print the number of days for each month for a given year.

import java.time.LocalDate;

public class NoOfDaysMonth {

    public static void main(String[] args) {

        LocalDate localDate  = LocalDate.of(2025, 01, 25);
      
        for(int i=0;i<12;i++){
           localDate= localDate.plusMonths(i);
            System.out.println(i+" month "+localDate.lengthOfMonth());
        }

        


        
    

    }

}
