public class CheesePizza extends Pizza {
PizzaIngredientFactory ingredientFactory;

public CheesePizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
}
void prepare() {
    System.out.println("Peparando" + name);
    cheese = ingredientFactory.createCheese();
    sauce = ingredientFactory.createSauce();
}
}