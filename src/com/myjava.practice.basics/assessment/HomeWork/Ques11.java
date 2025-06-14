// Write a program to prefix "Mr.", "Miss." to alternate names given in the string array


public class Ques11 {
public static void main(String[] args) {
    
    String [] arr={"Madasamy","Sathashini","Kishore","Keerthana","Shobhan","Chandralega","Raja","SudarVizhi"};

    for(int i=0;i<arr.length;i++){
        if(i%2==0){
            System.out.println("Mr "+arr[i]);

        }
        else{
            System.out.println("Miss "+arr[i]);
        }
    }

}
}
