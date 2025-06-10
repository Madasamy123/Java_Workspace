
import java.util.Scanner;
public class Temperature {


    public void checkTemp(float temp){
    

        if(temp<18 || temp>28){
            System.out.println("The temperature "+temp+ " is Out of Control");
        }
        else {
            if(temp<18 && temp>20){
                System.out.println("Coolest");
            }
             if(temp>20 && temp<24){
             System.out.println("Cooler");
            }
             if(temp>24 && temp<28){
                 System.out.println("Cool");
            }
        }

    

    }
    
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        Temperature temperature=new Temperature();

        float first=scn.nextFloat();
        float second=scn.nextFloat();
        float third=scn.nextFloat();
        float fourth=scn.nextFloat();
        float fifth=scn.nextFloat();

        temperature.checkTemp(first);
        temperature.checkTemp(second);
        temperature.checkTemp(third);
        temperature.checkTemp(fourth);
        temperature.checkTemp(fifth);



      
    }
    

}