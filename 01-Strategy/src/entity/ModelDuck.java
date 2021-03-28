package entity;

import flybehavior.FlyNoWay;
import quackbehavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyingBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
