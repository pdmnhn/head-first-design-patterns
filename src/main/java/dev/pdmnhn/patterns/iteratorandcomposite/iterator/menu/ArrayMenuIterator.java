package dev.pdmnhn.patterns.iteratorandcomposite.iterator.menu;

public class ArrayMenuIterator implements MenuIterator {
    private final MenuItem[] menuItems;
    private int position = 0;

    public ArrayMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public MenuItem next() {
        return menuItems[position++];
    }
}
