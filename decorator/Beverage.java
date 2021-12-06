public abstract class Beverage {
    String description = "Bebida en proceso";
     
    public String getDescription() {
     return description;
    }
    
    public abstract double costo();
   }