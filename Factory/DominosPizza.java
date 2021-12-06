public class DominosPizza extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("queso")) {
            		return new DominozQueso();
        	} else if (item.equals("vegetariana")) {
        	    	return new Dominozvegetariana();
        	} else if (item.equals("almeja")) {
        	    	return new Dominozalmeja();
        	} else if (item.equals("peperoni")) {
            		return new Dominozpeperoni();
        	} else return null;
	}
}