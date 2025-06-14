import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

         Scanner scn=new Scanner(System.in);
        
        System.out.println("Enter your array length: ");
        int num=scn.nextInt();

        
        String buildingNames= new String[num];


        for(int i=0;i<buildingNames.length();i++){

            String names=scn.nextLine();
            buildingNames[i]=names;
      
            
        }

        for(int i=0;i<buildingNames.length();i++){
            System.out.println(buildingNames);
        }
       
       

    }
    
}
