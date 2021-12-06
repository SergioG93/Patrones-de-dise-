public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item){
Pizza pizza = null;
PizzaIngredientFactory ingredientFactory =
new NYPizzaIngredientFactory();

if (item.equals("cheese")){
    pizza = new CheesePizza(ingredientFactory);
    pizza.setName("Pizza de queso estilo NY");
}
return pizza;
    }
}