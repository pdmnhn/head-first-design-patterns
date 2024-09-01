package dev.pdmnhn.patterns.factory.pizzastore.ingredients;

public class NewYorkPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] { new Garlic(), new Onion(), new RedPepper() };
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
