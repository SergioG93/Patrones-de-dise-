public class NYPizzaIngredientFactory implements PizzaIngredientFactory {



	public Sauce createSauce() {
		return new MarianaraSauce();
	}

	public Cheese createCheese() {
		return new RaggianoCheese();
        
	}

}