package dev.pdmnhn.patterns.iteratorandcomposite.iterator.menu;

public class BreakfastMenu implements Menu {
    private static final int MAX_MENU_ITEMS = 6;
    private MenuItem[] menuItems = new MenuItem[MAX_MENU_ITEMS];
    private int position = 0;

    public BreakfastMenu() {
        addMenuItem("Dosa", "Classic South Indian dosa served with yummy chutneys", 100.0, true);
        addMenuItem("Onion Paratha", "Tasty paratha stuffed with great onion and potato masala", 120.0, true);
    }

    public void addMenuItem(String name, String description, double price, boolean vegetarian) {
        if (position >= MAX_MENU_ITEMS) {
            throw new RuntimeException("More menu items than allowed");
        }
        menuItems[position++] = new MenuItem(name, description, price, vegetarian);
    }

    @Override
    public MenuIterator createIterator() {
        return new ArrayMenuIterator(menuItems);
    }
}
