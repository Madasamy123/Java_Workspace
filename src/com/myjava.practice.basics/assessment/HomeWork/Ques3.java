
//write a program to find the number of letters in the given sentence without space

public class Ques3 {
    public static void main(String[] args) {
        
        String sentence="A paragraph is a group of sentences that develops one central idea or topic";

        String words=sentence.replace(" ", "");

        System.out.println(words.length());

    }

}
