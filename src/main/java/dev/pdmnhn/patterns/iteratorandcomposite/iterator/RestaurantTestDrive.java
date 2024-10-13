package dev.pdmnhn.patterns.iteratorandcomposite.iterator;

import dev.pdmnhn.patterns.iteratorandcomposite.iterator.menu.BreakfastMenu;
import dev.pdmnhn.patterns.iteratorandcomposite.iterator.menu.DinnerMenu;

public class RestaurantTestDrive {
    public static void main(String... args) {
        BreakfastMenu breakfastMenu = new BreakfastMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        Waitress waitress = new Waitress(breakfastMenu, dinnerMenu);
        waitress.printMenu();
    }
}
