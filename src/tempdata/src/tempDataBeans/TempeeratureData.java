package tempDataBeans;

public class TempeeratureData {
    public static void main(String[] args) {
        
       
        Residential residential=new Residential();
         System.out.println(residential.getType());
        residential.setType("IndividualHouse");
         System.out.println(residential.getType());
    }

}
