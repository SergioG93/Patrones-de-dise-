public class Dominozpeperoni extends Pizza {
	public Dominozpeperoni() {
		name = "Pizza de peperoni Dominoz";
		dough = "Con borde crujiente";
		sauce = "Con salsa de tomate";

		toppings.add("Agregando queso Mozarella");
		toppings.add("Aceitunas negras");
		toppings.add("Champiñones");
		toppings.add("Verenjenas");
		toppings.add("Mucho Peperoni");
	}

	void cut() {
		System.out.println("Cortando la pizza en triangulos");
	}
}