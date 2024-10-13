package dev.pdmnhn.patterns.decorator.beverages;

public abstract class Beverage {
    public enum Size {
        TALL, GRANDE, VENTI
    }

    protected String description = "Unknown beverage";
    protected Size size;

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();
}
