//Write a program to get the name and the degree of the person as input and print the name with degree

import java.util.Scanner;

public class Ques12 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your name");

        String userName=input.nextLine();

        System.out.println("Enter your degree");

        String userDegree=input.nextLine();


        System.out.println("Name with degree: "+userName+" ,"+userDegree);
    }

}
