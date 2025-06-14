package tempDataBeans.beans;

public class TemperatureSensor implements Sensor{

     private float temp;

    // public void setTemperature(float setTemperature ){
    //     this.temperature=temperature;
    // }

  


    public TemperatureSensor(float temp){
        this.temp=temp;
    }

      public float getReading(){

        return temp;
    }
    
   
    @Override
    public float getReading(ReadingUnit unit){
  
        if(ReadingUnit.C.equals(unit)){
            System.out.println(temp);
            return temp;
        }
        else if(ReadingUnit.F.equals(unit)){
            return (temp *9/5)+32;
        }

        return 0.0f;
          
    }

    public static void main(String[] args) {
        
        TemperatureSensor temperatureSensor=new TemperatureSensor(25);
        temperatureSensor.getReading();
        temperatureSensor.getReading(ReadingUnit.C);
         temperatureSensor.getReading(ReadingUnit.F);
    }

}
