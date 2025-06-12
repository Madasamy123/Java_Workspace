import java.util.Scanner;

public class Ques3 {

    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your array length");
         int num=scn.nextInt();
          
        float [] arr=new float[num];

        for(int i=0;i<num;i++){
            String temp=scn.next();
              float first=Float.parseFloat(temp);
              arr[i]=first;
           
        }
        
      
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
    
}
