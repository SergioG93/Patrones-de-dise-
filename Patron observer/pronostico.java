public class pronostico implements Observer, Display {
    private float currentPressure = 29.92f;  
    private float lastPressure;
    private clima clima;
   
    public pronostico(clima weatherData) {
     this.clima = weatherData;
     weatherData.registerObserver(this);
    }
   
    public void update(float temp, float humidity, float pressure) {
                   lastPressure = currentPressure;
     currentPressure = pressure;
   
     display();
    }
   
    public void display() {
     System.out.print("Pronostico: ");
     if (currentPressure > lastPressure) {
      System.out.println("Dia perfecto para la playa");
     } else if (currentPressure == lastPressure) {
      System.out.println("Tenemos un hermoso dia");
     } else if (currentPressure < lastPressure) {
      System.out.println("Mucho frio ponte un sueter");
     }
    }
   }