public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item){
Pizza pizza = null;
PizzaIngredientFactory ingredientFactory =
new ChicagoPizzaIngredientFactory();

if (item.equals("cheese")){
    pizza = new CheesePizza(ingredientFactory);
    pizza.setName("Pizza de queso estilo Chicago");
}
return pizza;
    }
}