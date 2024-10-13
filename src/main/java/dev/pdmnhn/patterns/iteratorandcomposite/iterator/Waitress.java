package dev.pdmnhn.patterns.iteratorandcomposite.iterator;

import dev.pdmnhn.patterns.iteratorandcomposite.iterator.menu.Menu;
import dev.pdmnhn.patterns.iteratorandcomposite.iterator.menu.MenuItem;
import dev.pdmnhn.patterns.iteratorandcomposite.iterator.menu.MenuIterator;

public class Waitress {
    private final Menu breakfastMenu;
    private final Menu dinnerMenu;

    public Waitress(Menu breakfastMenu, Menu dinnerMenu) {
        this.breakfastMenu = breakfastMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        MenuIterator breakfastMenuIterator = breakfastMenu.createIterator();
        MenuIterator dinnerMenuIterator = dinnerMenu.createIterator();
        System.out.println("Breakfast Menu:");
        printMenu(breakfastMenuIterator);
        System.out.println("\nDinner Menu:");
        printMenu(dinnerMenuIterator);
    }

    private void printMenu(MenuIterator iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.println(item);
        }
    }
}
