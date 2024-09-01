package dev.pdmnhn.patterns.decorator.beverages.condiments;

import dev.pdmnhn.patterns.decorator.beverages.Beverage;


public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    public abstract String getDescription();
}
