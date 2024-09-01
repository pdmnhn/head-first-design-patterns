package dev.pdmnhn.patterns.factory.pizzastore;

import dev.pdmnhn.patterns.factory.pizzastore.pizza.Pizza;
import dev.pdmnhn.patterns.factory.pizzastore.store.ChicagoPizzaStore;
import dev.pdmnhn.patterns.factory.pizzastore.store.NewYorkPizzaStore;
import dev.pdmnhn.patterns.factory.pizzastore.store.PizzaStore;


public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NewYorkPizzaStore();
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());
        System.out.println();

        pizza = chicagoPizzaStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName());
        System.out.println();
    }
}
