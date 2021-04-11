import coffeetype.DarkRoast;
import coffeetype.Espsresso;
import coffeetype.HouseBlend;
import contiment.Mocha;
import contiment.Soy;
import contiment.Whip;
import abstracts.Beverage;

/*
*The Decorator Pattern attaches additional responsibilities to an object dynamically.
*Decorators provide a fl exible alternative tosubclassing for extending functionality
 */
public class DecoratorApp {
    public static void main(String[] args) {

        Beverage beverage = new Espsresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}