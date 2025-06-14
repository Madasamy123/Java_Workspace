package tempDataBeans;

public interface Sensor {
    
   

    public float getReading();

    public float getReading(String unit);
    public float getReading(ReadingUnit unit);

    

    
}
