package dev.pdmnhn.chapter01;

import dev.pdmnhn.chapter01.duck.Duck;
import dev.pdmnhn.chapter01.duck.MallardDuck;
import dev.pdmnhn.chapter01.duck.ModelDuck;
import dev.pdmnhn.chapter01.fly.FlyRocketPowered;


public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
