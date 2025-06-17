package dateExamples;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import java.util.Scanner;

public class FindBirth {
public static void main(String[] args) {
    
  

     Scanner sc= new Scanner(System.in);

    Date today= new Date();
    System.out.println(today);

    LocalDate dateOfBirth=LocalDate.of(2002, Month.NOVEMBER, 17);
    System.out.println(LocalDate.now().compareTo(dateOfBirth));


//    System.out.println(dateOfBirth.getDayOfMonth());
//    System.out.println(dateOfBirth.getYear());
//    System.out.println(dateOfBirth.getDayOfYear());
    
int dob=LocalDate.now().getDayOfMonth();
int year=LocalDate.now().getYear();
int month=LocalDate.now().getMonthValue();

System.out.println((year-dateOfBirth.getYear())+(month-dateOfBirth.getMonthValue())+(dob-dateOfBirth.getDayOfMonth()));





 

}
}
