public class TurkeyTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);
 
		for(int i=0;i<10;i++) {
			System.out.println("El adaptador pato dice...");
			duckAdapter.gobble();
			duckAdapter.fly();
		}
	}
}