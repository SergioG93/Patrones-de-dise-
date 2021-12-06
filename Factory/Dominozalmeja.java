public class Dominozalmeja extends Pizza {
	public Dominozalmeja() {
		name = "Pizza de almeja Dominoz";
		dough = "Orilla extra crujiente";
		sauce = "Con salsa de tomate";

		toppings.add("Queso mozarella");
		toppings.add("Mariscos frescos");
		toppings.add("Espinaca");
		toppings.add("Almejas");	
	}

	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}