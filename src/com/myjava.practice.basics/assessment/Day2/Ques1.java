public class Ques1 {

    public static void main(String[] args) {
        
        String [][] arr ={{"temp1","temp2","temp3","temp4","temp5"},{"22","23","24","25","26"}};
           int num=arr[0].length;
        for(int i=0;i<num;i++){
          
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[j][i]);
            }
        }
     }

    
}
