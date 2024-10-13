package dev.pdmnhn.patterns.iteratorandcomposite.iterator.menu;

import java.util.ArrayList;
import java.util.List;

public class DinnerMenu implements Menu {
    List<MenuItem> menuItems;

    public DinnerMenu() {
        menuItems = new ArrayList<>();
        addMenuItem("Paneer Biryani", "Yummy basmati rice and fluffy paneer cooked with rich Indian spices", 250.0,
                true);
        addMenuItem("North Indian Combo", "Paneer butter masala, phulka 2 pieces and gobi sabzi", 300.0, true);
    }

    public void addMenuItem(String name, String description, double price, boolean vegetarian) {
        menuItems.add(new MenuItem(name, description, price, vegetarian));
    }

    @Override
    public MenuIterator createIterator() {
        return new ListMenuIterator(menuItems);
    }
}
