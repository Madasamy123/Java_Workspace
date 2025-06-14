public class Ques4 {

    // Write a program to find the unique letters in the given string.
    public static void main(String[] args) {

    String sentence="full stack developer";
    
    String letters=sentence.replace(" ", "");

    for(int i=0;i<letters.length();i++){
        char  ch=letters.charAt(i);

        int count=0;
        for(int j=0;j<letters.length();j++){
            if(letters.charAt(j)==ch){
                count++;
            }
        }

     if(count==1){
        System.out.println("Unique letters: "+ch);
    }
    }

    
 
    }
}