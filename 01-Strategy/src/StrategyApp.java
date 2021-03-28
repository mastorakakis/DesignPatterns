import entity.*;
import flybehavior.FlyRocketPowered;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    private static void showInfo(Duck mallard) {
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        System.out.println();
    }
}
