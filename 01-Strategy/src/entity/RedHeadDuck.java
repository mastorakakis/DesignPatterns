package entity;

import flybehavior.FlyWithWings;
import quackbehavior.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyingBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
