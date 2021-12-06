import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();

	void prepare() {
		System.out.println("Preparando " + name);
		System.out.println("Preparando la masa...");
		System.out.println("Agregando salsa...");
		System.out.println("Agregando condimentos: ");
		for (String topping : toppings) {
			System.out.println("   " + topping);
		}
	}

	void bake() {
		System.out.println("Hornear por 25 minutos a 350");
	}

	void cut() {
		System.out.println("Cortando la pizza en triangulos");
	}

	void box() {
		System.out.println("Guardando la pizza en una caja");
	}

	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
}