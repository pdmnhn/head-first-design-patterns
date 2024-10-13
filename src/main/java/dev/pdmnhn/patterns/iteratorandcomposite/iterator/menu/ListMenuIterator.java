package dev.pdmnhn.patterns.iteratorandcomposite.iterator.menu;

import java.util.List;

public class ListMenuIterator implements MenuIterator {
    private final List<MenuItem> menuItems;
    private int position = 0;

    public ListMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);
    }
}
