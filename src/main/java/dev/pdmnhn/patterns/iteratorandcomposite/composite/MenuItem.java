package dev.pdmnhn.patterns.iteratorandcomposite.composite;

public class MenuItem implements MenuComponent {
    private final String name;
    private final String description;
    private final boolean vegetarian;
    private final double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.print(" " + getName());
        System.out.print(isVegetarian() ? "(Veg)" : "(Non-Veg)");
        System.out.println(" " + getPrice());
        System.out.println("    -- " + getDescription());
    }
}
