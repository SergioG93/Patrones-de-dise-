public class Dominozvegetariana extends Pizza {
	public Dominozvegetariana() {
		name = "Pizza vegetariana Dominoz";
		dough = "Bordes crujientes";
		sauce = "Con salsa de tomate";

		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Aceitunas negras");
		toppings.add("Espinaca");
		toppings.add("Alcachofa");
		toppings.add("Champiñones");
	}

	void cut() {
		System.out.println("Cortando la pizza en triangulos");
	}
}