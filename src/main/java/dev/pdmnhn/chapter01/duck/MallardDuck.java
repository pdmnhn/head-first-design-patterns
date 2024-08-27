package dev.pdmnhn.chapter01.duck;

import dev.pdmnhn.chapter01.fly.FlyWithWings;
import dev.pdmnhn.chapter01.quack.Quack;


public class MallardDuck extends Duck {
    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
