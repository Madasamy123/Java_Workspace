package tempDataBeans;

public final class Commericial extends Building {
    private String time;

    @Override
    public void getEBill(){
        System.out.println("CurrentBill is commericial ");
    }

    public static class Parking{

        public void print(){
            System.out.println("Parking of same building");
        }
    }







}
