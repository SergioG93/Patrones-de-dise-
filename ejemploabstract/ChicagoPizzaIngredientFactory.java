public class ChicagoPizzaIngredientFactory
	implements PizzaIngredientFactory
{


	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozarellaCheese();
	}
}
