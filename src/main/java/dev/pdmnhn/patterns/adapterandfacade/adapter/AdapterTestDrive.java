package dev.pdmnhn.patterns.adapterandfacade.adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;


public class AdapterTestDrive {
    public static void main(String[] args) {
        Vector<Integer> integers = new Vector<>(List.of(1, 2, 3, 4));
        Enumeration<Integer> enumeration = integers.elements();
        Iterator<Integer> iterator = new EnumerationAdapter<>(enumeration);
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
