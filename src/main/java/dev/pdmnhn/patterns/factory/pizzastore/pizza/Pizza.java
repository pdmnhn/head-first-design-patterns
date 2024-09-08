package dev.pdmnhn.patterns.factory.pizzastore.pizza;

import java.util.List;
import dev.pdmnhn.patterns.factory.pizzastore.ingredients.Cheese;
import dev.pdmnhn.patterns.factory.pizzastore.ingredients.Clams;
import dev.pdmnhn.patterns.factory.pizzastore.ingredients.Dough;
import dev.pdmnhn.patterns.factory.pizzastore.ingredients.Sauce;
import dev.pdmnhn.patterns.factory.pizzastore.ingredients.Veggies;


public abstract class Pizza {
    protected String name;

    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking for 25 minutes at 350F...");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
