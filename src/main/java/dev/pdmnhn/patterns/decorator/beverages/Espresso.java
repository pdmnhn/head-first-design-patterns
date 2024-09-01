package dev.pdmnhn.patterns.decorator.beverages;

public class Espresso extends Beverage {
    public Espresso(Size size) {
        setSize(size);
        description = "Espresso - " + size.name();
    }

    @Override
    public double cost() {
        return 1.99 + (size.ordinal() + 1);
    }
}
