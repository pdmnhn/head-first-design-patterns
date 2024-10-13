package dev.pdmnhn.patterns.iteratorandcomposite.iterator.menu;

public record MenuItem(String name, String description, double price, boolean vegetarian) {
    @Override
    public String toString() {
        return "Name: " + name + ", Description: " + description + ", Price: Rs." + price + " "
                + (vegetarian ? "(Veg)" : "(Non-Veg)");
    }
}
