public class Soya extends CondimentDecorator {
    Beverage beverage;
   
    public Soya(Beverage beverage) {
     this.beverage = beverage;
    }
   
    public String getDescription() {
     return beverage.getDescription() + ", Soya";
    }
   
    public double costo() {
     return .15 + beverage.costo();
    }
   }