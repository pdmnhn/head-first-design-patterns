package dev.pdmnhn.patterns.factory.pizzastore.pizza;

import java.util.List;


public class NewYorkStyleCheesePizza extends Pizza {
    public NewYorkStyleCheesePizza() {
        name = "New York Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings = List.of("Grated Reggiano Cheese");
    }
}
