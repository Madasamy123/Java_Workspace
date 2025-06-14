public class BuildingsCount {

    public void print(int buildingsCount,int floorCount){
        int i=0;
        System.out.println(buildingsCount);
       
        while(i<=floorCount){
            System.out.println(i);
            i++;
        }

    }

    public static void main(String[] args) {
        
        BuildingsCount buildingsCount=new BuildingsCount();
        buildingsCount.print(1,10);
    }
    
}
