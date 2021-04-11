package coffeetype;

import abstracts.Beverage;

public class Espsresso extends Beverage {

    public Espsresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
