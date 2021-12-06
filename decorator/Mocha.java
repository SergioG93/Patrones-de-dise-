public class Mocha extends CondimentDecorator {
    Beverage beverage;
    
    public Mocha(Beverage beverage) {
     this.beverage = beverage;
    }
    
    public String getDescription() {
     return beverage.getDescription() + ", Mocha";
    }
    
    public double costo() {
     return 2.7 + beverage.costo();
    }
   }