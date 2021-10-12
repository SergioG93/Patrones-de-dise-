    //Condiciones climaticas//
public class Condicion_actual implements Observer, Display {
    private float temperatura;
    private float humedad;
    private Subject clima;
    
    public Condicion_actual(Subject clima) {
     this.clima = clima;
     clima.registerObserver(this);
    }
    
    public void update(float temperatura, float humedad, float pressure) {
     this.temperatura = temperatura;
     this.humedad = humedad;
     display();
    }
    
    public void display() {
     System.out.println("Condiciones Actuales por SERGIO GARZA AGUILAR: " + temperatura 
      + "F grados y " + humedad + "% humedad");
    }
   }

