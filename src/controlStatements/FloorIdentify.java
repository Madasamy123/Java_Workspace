
public class FloorIdentify {

    public void identifyFloorType(int floorNumber){

        if(floorNumber%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        FloorIdentify fI=new FloorIdentify();
        fI.identifyFloorType(21);
    }


    
}
