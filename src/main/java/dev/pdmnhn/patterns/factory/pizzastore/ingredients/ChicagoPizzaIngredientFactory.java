package dev.pdmnhn.patterns.factory.pizzastore.ingredients;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] { new BlackOlives(), new EggPlant(), new BlackOlives() };
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
