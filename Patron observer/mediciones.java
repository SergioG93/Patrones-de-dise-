public class mediciones implements Observer, Display {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private clima clima;
   
    public mediciones(clima weatherData) {
     this.clima = weatherData;
     weatherData.registerObserver(this);
    }
   
    public void update(float temp, float humidity, float pressure) {
     tempSum += temp;
     numReadings++;
   
     if (temp > maxTemp) {
      maxTemp = temp;
     }
    
     if (temp < minTemp) {
      minTemp = temp;
     }
   
     display();
    }
   
    public void display() {
     System.out.println("Media/Maxima/Minima temperatura = " + (tempSum / numReadings)
      + "/" + maxTemp + "/" + minTemp);
    }
   }

   