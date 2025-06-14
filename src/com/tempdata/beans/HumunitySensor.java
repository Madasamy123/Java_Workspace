package tempDataBeans;

public class HumunitySensor implements Sensor {

  private float humunity;

  public void setHumunity(float humunity){
    this.humunity=humunity;
  }

  public float getHumunity(){
    return humunity;
  }

  public float getHumunity(String unit){
    return unit;
  }


}
