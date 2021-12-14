public class perro implements Animal {

	public perro(){
		
		System.out.println("Se hizo un perro");
		
	}
	
	public Animal makeCopy() {
		
		System.out.println("Se hizo una copia del perro");
		
		perro perroObject = null;
		
		try {
			
			// Calls the Animal super classes clone()
			// Then casts the results to Sheep
			
			perroObject = (perro) super.clone();
			
		}
		
		// If Animal didn't extend Cloneable this error 
		// is thrown
		
		catch (CloneNotSupportedException e) {
			  
			System.out.println("Perro Turned to Mush");
			
			e.printStackTrace();
			  
		 }
		
		return perroObject;
	}
	
	public String toString(){
		
		return "Soy un perro guaf";
		
	}
	
}