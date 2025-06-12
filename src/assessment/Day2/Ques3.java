import java.util.Scanner;

public class Ques3 {

    public static void main(String[] args) {
        
        Scanner scn= new Scanner(System.in);

        int noOfSensor=scn.nextInt();
        int noOfTemperature=scn.nextInt();

        String [][] tempArray=new String[noOfSensor][noOfTemperature+1];

        for(int i=0;i<tempArray.length;i++){
            for(int j=0;j<tempArray[i].length;j++){
                tempArray[i][j]=scn.next();
            }
        }

        for(int i=0;i<tempArray.length;i++){
            System.out.println();

            for(int j=0;j<tempArray[i].length;j++){
                if(j<tempArray[i].length-1){
                    System.out.println(tempArray[i][j]);
                }
            }
        }

    }

    
}
