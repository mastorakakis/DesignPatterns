package flybehavior;

public class FlyRocketPowered implements FlyingBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
