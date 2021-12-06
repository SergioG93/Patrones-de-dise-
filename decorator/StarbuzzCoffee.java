public class StarbuzzCoffee {
 
    public static void main(String args[]) {

           // Hacer HouseBlend
     Beverage beverage = new Decaf();
           // Con Mocha.
     beverage = new Leche(beverage);
           // Con Whip
     beverage = new Soya(beverage);
     System.out.println(beverage.getDescription() 
       + " $" + beverage.costo());
    
     Beverage beverage2 = new DarkRoast();
                // Con Mocha.
     beverage2 = new Mocha(beverage2);
                // Con Mocha.
     beverage2 = new Mocha(beverage2);
     System.out.println(beverage2.getDescription() 
       + " $" + beverage2.costo());

     Beverage beverage3 = new DarkRoast();
     System.out.println(beverage3.getDescription() 
         + " $" + beverage3.costo());

         // Subtotal
     float total = (float) (beverage3.costo() + beverage2.costo() + beverage.costo());
     System.out.println("Subtotal $" + total );  
         // IVA
     float iva = (float) (total * 0.16);
     System.out.println("IVA $" + iva );  
     //Final
     float fin = (float) (iva + total);
     System.out.println("Total $" + fin );  

     

    }
   }