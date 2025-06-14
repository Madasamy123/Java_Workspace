public class Ques7 {
    public static void main(String[] args) {
        
        String sentences="Java is easy. It is powerful. Let's learn it!";

        String []words=sentences.split("\\.");

        // sentence count

        int count=0;
        for(int i=0;i<words.length;i++){
            count++;
        }

        // words count

        String []letters=sentences.split(" ");




        System.out.println("sentence count: "+count);
        System.out.println("words count: "+letters.length);
        System.out.println("letters count: "+sentences.length());

    }

}
