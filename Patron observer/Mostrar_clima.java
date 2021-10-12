public class Mostrar_clima {

    public static void main(String[] args) {
     clima clima = new clima();
    
     Condicion_actual Condicion_actual = 
     new Condicion_actual(clima);
     mediciones statisticsDisplay = new mediciones(clima);
     pronostico forecastDisplay = new pronostico(clima);
   
     clima.setMeasurements(80, 65, 30.4f);
     clima.setMeasurements(82, 70, 29.2f);
     clima.setMeasurements(78, 90, 29.2f);
    }
   }