package dev.pdmnhn.patterns.decorator.beverages.condiments;

import dev.pdmnhn.patterns.decorator.beverages.Beverage;


public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy - " + size.name();
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.25 + size.ordinal() * 0.10;
    }
}
