public class practice {

    public void print(int noOfFloor){
          int i=0;

        while(i<noOfFloor){
            System.out.println("No of floor: "+ i);
            i++;
        }
        
    }

    public static void main(String[] args) {
      

        practice prac=new practice();
        prac.print(20);
    }
    
}
