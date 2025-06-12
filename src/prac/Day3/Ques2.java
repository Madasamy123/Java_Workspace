// public class Ques2 {

//     public static void main(String[] args) {
//         String [] arr=new String[5];
//         arr[0]="a";
//         arr[1]="b";
//         arr[2]="c";
//         arr[3]="d";
//         arr[4]="e";

//       String [] newArray=new String[4];
       
//       for(int i=0,j=0;i<arr.length;i++){
//         if(!arr[i].equals("c")){
//          newArray[j]=arr[i];
//          j++;
//         }
//       }
      
//       for(int k=0;k<newArray.length;k++){
//         System.out.println(newArray[k]);
//       }

//     }
    
// }


public class Ques2 {

    public static void main(String[] args) {
        String [] arr=new String[5];
        arr[0]="a";
        arr[1]="b";
        arr[2]="c";
        arr[3]="d";
        arr[4]="e";

    
       
      for(int i=0,j=0,count=0;i<arr.length;i++){
        if(!arr[i].equals("c")){
            arr[j]=arr[i];  
             j++;
           
        }
       
      }
  
    //   arr[arr.length-1]=null;

  for(int x=arr.length-count;x<arr.length;x++){
    arr[x]=null;
  }

    for(int k=0;k<arr.length;k++){
    System.out.println(arr[k]);
  }

    }
    
}
