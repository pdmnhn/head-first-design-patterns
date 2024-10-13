package dev.pdmnhn.patterns.strategy;

import dev.pdmnhn.patterns.strategy.duck.Duck;
import dev.pdmnhn.patterns.strategy.duck.MallardDuck;
import dev.pdmnhn.patterns.strategy.duck.ModelDuck;
import dev.pdmnhn.patterns.strategy.fly.FlyRocketPowered;

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
