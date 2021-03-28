import entity.*;
import flybehavior.FlyRocketPowered;

public class StrategyApp {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        System.out.println();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyingBehavior(new FlyRocketPowered());
        model.performFly();
        model.performQuack();

        System.out.println();

        Duck red = new RedHeadDuck();
        red.display();
        red.performFly();
        red.performQuack();

        System.out.println();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly();
        rubber.performQuack();
    }
}
