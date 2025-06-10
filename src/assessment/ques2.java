package assessment;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter your sensor name: ");
        String sname=scn.nextLine();

        System.out.println("Enter your sensor temperatures: ");

        float first =scn.nextInt();
        float second =scn.nextInt();
        float third =scn.nextInt();
        float fourth =scn.nextInt();
        float fifth =scn.nextInt();

        float avg= (first+second+third+fourth+fifth)/5;

        System.out.println("Average of Five Temperatures: "+avg);

        scn.close();
    }
    
}
