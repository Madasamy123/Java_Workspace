//Write a program to find the vowels in the given string.

public class Ques10 {
    public static void main(String[] args) {
        
     String words="Tirunelveli";
     String vowels="aeiouAEIOU";

     for(int i=0;i<words.length();i++){
        char ch=words.charAt(i);

        if(vowels.indexOf(ch)!=-1){
            System.out.println(ch);
        }
     }

    }

}
