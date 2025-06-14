// Write a program to find the words in a given sentence

public class Ques1 {

    public static void main(String[] args) {
        String words="A paragraph is a group of sentences that develops one central idea or topic";

        String [] letters=words.split(" ");

        System.out.println(letters);

        for(int i=0;i<letters.length;i++){

            System.out.println(letters[i]);


        }
        
        
        
        
    }


}
