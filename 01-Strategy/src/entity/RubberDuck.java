package entity;

import flybehavior.FlyNoWay;
import quackbehavior.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyingBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
}
