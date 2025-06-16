import java.util.StringTokenizer;

public class StringTokanizerExample {

    public static void main(String[] args) {
        
        String sentence ="String is immutable object which stores value as byte array";
        StringTokenizer words=new StringTokenizer(sentence," ",true);

        System.out.println(words.countTokens());

        while(words.hasMoreTokens()){
            System.out.println(words.nextToken());

                
            
        }
    }
}
