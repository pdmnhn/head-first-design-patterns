package dev.pdmnhn.patterns.factory.pizzastore.store;

import dev.pdmnhn.patterns.factory.pizzastore.pizza.ChicagoStyleCheesePizza;
import dev.pdmnhn.patterns.factory.pizzastore.pizza.Pizza;


public class ChicagoPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}
