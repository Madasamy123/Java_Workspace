package StringExample;

import java.util.Scanner;

public class StringDegreeExample {
    public static void main(String [] args){
        
        Scanner input=new Scanner(System.in);
        
        String name=input.nextLine();
        String degree=input.nextLine();
        String stream=input.nextLine();
        String college=input.nextLine();

        StringBuilder stringBuilder=new StringBuilder();

        System.out.println(stringBuilder.append(name).append(" ").append(degree).append(" ").append(stream).append(" ").append(college));
    }

}
