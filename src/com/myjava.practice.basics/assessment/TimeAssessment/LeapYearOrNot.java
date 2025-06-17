// Write a program to find if the given year is leap year or not

import java.time.LocalDate;
import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);

        System.out.println("Enter year: ");
        int findYear=input.nextInt();

        Boolean isLeap=false;

        if((findYear%4==0 && findYear%100!=0) || (findYear%400==0)){
            isLeap=true;
        }
        

        if(isLeap){
            System.out.println(findYear+" is a Leap year");
        }
        else{
            System.out.println(findYear+" is NOT a Leap year");
        }
    }

}
