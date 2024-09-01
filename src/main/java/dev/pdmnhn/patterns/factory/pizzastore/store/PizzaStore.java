package dev.pdmnhn.patterns.factory.pizzastore.store;

import dev.pdmnhn.patterns.factory.pizzastore.pizza.Pizza;


public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    abstract public Pizza createPizza(String type);
}
