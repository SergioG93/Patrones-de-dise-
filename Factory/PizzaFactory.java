public class PizzaFactory {

	public static void main(String[] args) {
		PizzaStore mamamiapizza = new Mamamiapizza();
		PizzaStore dominospizza = new DominosPizza();

		Pizza pizza = mamamiapizza.orderPizza("queso");
		System.out.println("Preparada la orden " + pizza.getName() + "\n");

		pizza = dominospizza.orderPizza("vegetariana");
		System.out.println("Preparada la orden " + pizza.getName() + "\n");

		pizza = dominospizza.orderPizza("peperoni");
		System.out.println("Preparada la orden " + pizza.getName() + "\n");

		System.out.println("SERGIO ALBERTO GARZA AGUILAR 15211700 "+ "\n" + "PRACTICA DE CLASE" );
	}
}