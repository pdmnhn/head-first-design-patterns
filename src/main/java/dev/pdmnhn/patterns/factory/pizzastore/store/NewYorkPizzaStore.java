package dev.pdmnhn.patterns.factory.pizzastore.store;

import dev.pdmnhn.patterns.factory.pizzastore.ingredients.NewYorkPizzaIngredientFactory;
import dev.pdmnhn.patterns.factory.pizzastore.ingredients.PizzaIngredientFactory;
import dev.pdmnhn.patterns.factory.pizzastore.pizza.CheesePizza;
import dev.pdmnhn.patterns.factory.pizzastore.pizza.ClamPizza;
import dev.pdmnhn.patterns.factory.pizzastore.pizza.Pizza;

public class NewYorkPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NewYorkPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New york style cheese pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New york style clam pizza");
        }
        return pizza;
    }
}
