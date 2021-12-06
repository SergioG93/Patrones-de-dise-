public class Mamamiapizza extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("queso")) {
			return new Mamamiaqueso();
		} else if (item.equals("vegetariana")) {
			return new Mamamiavegetariana();
		} else if (item.equals("anchoas")) {
			return new Mamamiaanchoas();
		} else if (item.equals("peperoni")) {
			return new Mamamiapeperoni();
		} else return null;
	}
}