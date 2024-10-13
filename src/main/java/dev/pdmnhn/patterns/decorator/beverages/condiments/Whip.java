package dev.pdmnhn.patterns.decorator.beverages.condiments;

import dev.pdmnhn.patterns.decorator.beverages.Beverage;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip - " + size.name();
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15 + size.ordinal() * 0.10;
    }
}
