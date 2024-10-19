package dev.pdmnhn.patterns.adapterandfacade.adapter;

import java.util.Enumeration;
import java.util.Iterator;


public class EnumerationAdapter<E> implements Iterator<E> {
    private final Enumeration<E> enumeration;

    public EnumerationAdapter(Enumeration<E> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
