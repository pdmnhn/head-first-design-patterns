package dev.pdmnhn.chapter01.duck;

import dev.pdmnhn.chapter01.fly.FlyNoWay;
import dev.pdmnhn.chapter01.quack.Quack;


public class ModelDuck extends Duck {
    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
