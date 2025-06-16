package dateExamples;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class dataExample {
public static void main(String[] args) {
    
    Date today= new Date();
    System.out.println(today);
    
    LocalDate dateOfBirth=LocalDate.of(1999, Month.APRIL, 4);
    System.out.println(dateOfBirth);
}
}
