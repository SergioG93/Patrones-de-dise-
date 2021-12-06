public class Leche extends CondimentDecorator {
    Beverage beverage;
   
    public Leche(Beverage beverage) {
     this.beverage = beverage;
    }
   
    public String getDescription() {
     return beverage.getDescription() + ", Leche";
    }
   
    public double costo() {
     return .10 + beverage.costo();
    }
   }