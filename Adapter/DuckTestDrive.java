public class DuckTestDrive {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();

		Turkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("El pavo dice...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\nEl pato dice...");
		testDuck(duck);

		System.out.println("\nThe Adaptador Pavo dice...");
		testDuck(turkeyAdapter);
		

        System.out.println("\nSERGIO ALBERTO GARZA AGUILAR---15211700");

	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}