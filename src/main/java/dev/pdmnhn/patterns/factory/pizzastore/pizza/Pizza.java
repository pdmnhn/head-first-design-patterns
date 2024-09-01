package dev.pdmnhn.patterns.factory.pizzastore.pizza;

import java.util.List;


public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings;

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding toppings: ");
        for(String topping: toppings) {
            System.out.println("\t" + topping);
        }
    }

    public void bake() {
        System.out.println("Baking for 25 minutes at 350F...");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
