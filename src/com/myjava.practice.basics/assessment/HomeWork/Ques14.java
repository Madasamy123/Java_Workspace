
// Write a program to find the indexes of the vowels in a given string.

public class Ques14 {
    public static void main(String[] args) {

     String word="Madasamy";
     String vowels="aeiouAEIOU";


     for(int i=0;i<word.length();i++){
        char ch=word.charAt(i);

        if(vowels.indexOf(ch)!=-1){
            System.out.println("vowel: "+ch+" index: "+i);
        }
     }
    }
}

