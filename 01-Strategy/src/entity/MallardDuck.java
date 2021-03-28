package entity;

import flybehavior.FlyWithWings;
import quackbehavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyingBehavior = new FlyWithWings();
    }
}
