package dev.pdmnhn.patterns.factory.pizzastore.store;

import dev.pdmnhn.patterns.factory.pizzastore.ingredients.ChicagoPizzaIngredientFactory;
import dev.pdmnhn.patterns.factory.pizzastore.ingredients.PizzaIngredientFactory;
import dev.pdmnhn.patterns.factory.pizzastore.pizza.CheesePizza;
import dev.pdmnhn.patterns.factory.pizzastore.pizza.ClamPizza;
import dev.pdmnhn.patterns.factory.pizzastore.pizza.Pizza;


public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago style cheese pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago style clam pizza");
        }
        return pizza;
    }
}
