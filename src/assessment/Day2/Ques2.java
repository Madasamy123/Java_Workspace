import java.util.Scanner;

public class Ques2 {

    public static void main(String[] args) {

         Scanner scn=new Scanner(System.in);

        int num=scn.nextInt();
        int [] arr= new int[num];

        for(int i=0;i<arr.length;i++){
             int number=scn.nextInt();
             arr[i]=number;
        }
 
        System.out.println("The Even Number is:");
       
        for(int j=0;j<arr.length;j++){
             if(arr[j]%2==0){
                System.out.println(arr[j]);
        }

        }
       


           

           
    }
    
}
