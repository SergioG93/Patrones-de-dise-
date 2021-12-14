public class TestCloning {
	
	public static void main(String[] args){
		
		// Handles routing makeCopy method calls to the 
		// right subclasses of Animal
		
		CloneFactory animalMaker = new CloneFactory();
		
		// Creates a new Sheep instance
		
		Sheep sally = new Sheep();
		perro rocky = new perro();

		
		// Creates a clone of Sally and stores it in its own
		// memory location
		
		Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
		perro clonepPerro = (perro) animalMaker.getClone(rocky);

		
		// These are exact copies of each other
		
		System.out.println(sally);
		System.out.println(rocky);

		
		System.out.println(clonedSheep);

		System.out.println(clonepPerro);

		
		System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));
		
		System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));

		System.out.println("Rocky HashCode: " + System.identityHashCode(System.identityHashCode(rocky)));
		
		System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonepPerro)));

	}
	
}