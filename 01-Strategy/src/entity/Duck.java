package entity;

import flybehavior.FlyingBehavior;
import quackbehavior.QuackBehavior;

public abstract class Duck {

    FlyingBehavior flyingBehavior;
    QuackBehavior quackBehavior;

    public void performFly() {
        flyingBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void display() {
        System.out.println("I'm a " + getClass().getSimpleName());
    }

    public void setFlyingBehavior(FlyingBehavior flyingBehavior) {
        System.out.println("Setting flying behavior:");
        this.flyingBehavior = flyingBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        System.out.print("Setting quack behavior: ");
        this.quackBehavior = quackBehavior;
    }
}
