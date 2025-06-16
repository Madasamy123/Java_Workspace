package dateExamples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConvertDate {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);

        String inputDate=input.next();

        LocalDate localDate=LocalDate.parse(inputDate);
        System.out.println(localDate);

       System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd-L-YYYY")));  // 3
       System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd-LLL-YYYY")));  //  Mar
       System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd-LLLL-YYYY"))); //  March
        
        

        

    }

}
