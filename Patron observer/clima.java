import java.util.*;

public class clima implements Subject {
 private ArrayList<Observer> observers;
 private float temperatura;
 private float humedad;
 private float presion;
 
 public clima() {
  observers = new ArrayList<>();
 }
 
 public void registerObserver(Observer o) {
  observers.add(o);
 }
 
 public void removeObserver(Observer o) {
  int i = observers.indexOf(o);
  if (i >= 0) {
   observers.remove(i);
  }
 }
 
 public void notifyObservers() {
  for (int i = 0; i < observers.size(); i++) {
   Observer observer = (Observer)observers.get(i);
   observer.update(temperatura, humedad, presion);
  }
 }
 
 public void measurementsChanged() {
  notifyObservers();
 }
 
 public void setMeasurements(float temperatura, float humedad, float presion) {
  this.temperatura = temperatura;
  this.humedad = humedad;
  this.presion = presion;
  measurementsChanged();
 }
 
 public float getTemperature() {
  return temperatura;
 }
 
 public float getHumidity() {
  return humedad;
 }
 
 public float getPressure() {
  return presion;
 }
}