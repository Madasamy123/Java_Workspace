// Write a program to find the building name starts with S from the list of building name string

public class Ques13 {
    public static void main(String[] args) {

        String [] buildingNames={"saravana","madasamy","vignesh","bala","sudharasan","sfghj"};

        for(int i=0;i<buildingNames.length;i++){
            if(buildingNames[i].startsWith("s")){
                System.out.println(buildingNames[i]);
            }
        }

        
    }

}
