// Write a program to find the number of sentences in the given paragraph. use full stop as sentence splitter

public class Ques6 {

    public static void main(String[] args) {
        
        String sentence="This is a Java program. It counts sentences ";

        String [] words=sentence.split("\\.");
        System.out.println(words.length);
    }

}
