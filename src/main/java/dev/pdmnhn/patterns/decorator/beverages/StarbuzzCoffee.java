package dev.pdmnhn.patterns.decorator.beverages;

import dev.pdmnhn.patterns.decorator.beverages.condiments.Mocha;
import dev.pdmnhn.patterns.decorator.beverages.condiments.Whip;


public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(Beverage.Size.TALL);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        Beverage beverage2 = new HouseBlend(Beverage.Size.GRANDE);
        beverage2 = new Mocha(beverage2);
        beverage2.setSize(Beverage.Size.VENTI);
        beverage2 = new Mocha(beverage2);
        beverage2.setSize(Beverage.Size.VENTI);
        beverage2 = new Whip(beverage2);
        beverage2.setSize(Beverage.Size.TALL);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
