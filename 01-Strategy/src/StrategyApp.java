/*
The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from clients that use it.
* */
import entity.*;
import flybehavior.FlyRocketPowered;

import java.util.ArrayList;
import java.util.List;

public class StrategyApp {

    public static void main(String[] args) {

        List<Duck> ducks = new ArrayList<>();
        ducks.add(new MallardDuck());
        ducks.add(new ModelDuck());
        ducks.add(new RedHeadDuck());
        ducks.add(new RubberDuck());

        ducks.stream()
                .forEach(StrategyApp::showInfo);
        System.out.println("Model duck after altering flying behavior");
        ducks.stream()
                .filter(duck -> duck instanceof ModelDuck)
                .forEach(duck -> {
                    duck.setFlyingBehavior(new FlyRocketPowered());
                    StrategyApp.showInfo(duck);
                });
    }

    private static void showInfo(Duck duck) {
        duck.display();
        duck.performFly();
        duck.performQuack();
        System.out.println();
    }
}
