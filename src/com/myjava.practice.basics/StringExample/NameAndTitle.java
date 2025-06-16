import java.util.Scanner;

public class NameAndTitle {
    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);

    int num=input.nextInt();

    String [] names=new String[num];

    StringBuffer newStr = new StringBuffer();

    for(int i=0;i<names.length;i++){
     
      if(i%2==0){
        System.out.println(StringBuffer.insert(0, "Mr. ").append(names));
      }



 
    }

}
