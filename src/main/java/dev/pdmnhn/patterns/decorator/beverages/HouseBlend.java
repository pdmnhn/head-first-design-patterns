package dev.pdmnhn.patterns.decorator.beverages;

public class HouseBlend extends Beverage {
    public HouseBlend(Size size) {
        setSize(size);
        description = "House Blend Coffee - " + size.name();
    }

    @Override
    public double cost() {
        return 0.89 * (size.ordinal() + 1);
    }
}
