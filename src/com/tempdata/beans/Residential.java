package tempDataBeans;

public final class Residential extends Building {

    private String type;

    public void setType(String type){
        this.type=type;

    }
    public String getType(){
        return type;
    }

    @Override

    public  void getEBill(){
        System.out.println("This Residential EB bill");
    }


}
