package dev.pdmnhn.patterns.factory.pizzastore.store;

import dev.pdmnhn.patterns.factory.pizzastore.pizza.NewYorkStyleCheesePizza;
import dev.pdmnhn.patterns.factory.pizzastore.pizza.Pizza;


public class NewYorkPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) {
            pizza = new NewYorkStyleCheesePizza();
        }
        return pizza;
    }
}
