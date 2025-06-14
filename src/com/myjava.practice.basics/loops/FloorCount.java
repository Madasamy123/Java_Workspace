public class FloorCount {
    
    public void print(int noOfFloor){

        for(int i=0;i<noOfFloor;i++){
            System.out.println("No.of Floor "+i);
        }

    }

    public static void main(String[] args) {
        FloorCount fc=new FloorCount();
        fc.print(23);
    }
    
}
