public class DominozQueso extends Pizza {
	public DominozQueso() {
		name = "Dominoz Pizza de Queso";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";

		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Sliced Pepperoni");
	}

	void cut() {
		System.out.println("Cortando la pizza en triangulos");
	}
}

