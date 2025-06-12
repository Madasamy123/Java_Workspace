package tempDataBeans;

public  abstract class Building {
    private Floor[] floors;
    private String colour;
    private String shape;
    private String name;
    private double height;
    private int buildingsNumber;
    private int noOfFloors;
    private double squareFeet;
    private boolean parkingsAvailable;

    public abstract void getEBill();


}
