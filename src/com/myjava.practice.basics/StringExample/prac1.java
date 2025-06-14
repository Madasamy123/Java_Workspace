public class prac1 {
    public static void main(String[] args) {

      
        
        String words= "String is immutable object which stores value as byte array";

        // split string array

           String letters [] =words.split(" ");


        //  Third method  use split and join

       String newString=String.join("",letters );
        System.out.println("String length: "+newString.length());

        
          
        //  string words length 

        System.out.println("String  words length is: "+letters.length);

        //  string letterrs length


        System.out.println("String letters length: "+words.length());


        //  use replace method to find letters length

        System.out.println("second method: "+words.replace(" ", "").length());


        // use toChar array to find letters length

        char [] findletters=words.toCharArray();

          int count=0;
        for(int i=0;i<findletters.length;i++){
           
            if(findletters[i]!=' '){
                count++;
            }
        }


        System.out.println("Third method: "+count);




        //   fourth method






    
     
    

      


    }

}
