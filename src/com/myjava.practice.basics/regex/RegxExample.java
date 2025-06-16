package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxExample {
    public static void main(String[] args) {
        Pattern namePatttern=Pattern.compile("Mr.[a-zA-Z]");
        Matcher matcher=namePatttern.matcher("Mr.Mdsmy");
        System.out.println(matcher.find());


        ///   split comma and whitespace

        String s="I am madasamy completed Diploma in mechanical Engineering, from Sankar Polytechnic college";

        String [] words=s.split(",|\\s");  // not working you will check

        for(String word:words){
            System.out.println(word);
        }


        //   check vowels in string

          Pattern namePattern = Pattern.compile("[^aeiou]+");
          Matcher namStrineMatcher=namePattern.matcher("mdday");

          System.out.println(nameMatcher.find());



    }

}
