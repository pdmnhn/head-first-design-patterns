package dev.pdmnhn.patterns.decorator.beverages.condiments;

import dev.pdmnhn.patterns.decorator.beverages.Beverage;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha - " + size.name();
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10 + size.ordinal() * 0.05;
    }
}
