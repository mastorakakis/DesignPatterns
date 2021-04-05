package observer;
/*
The Observer Pattern defines a one-to-many dependency between objects so that when one
object changes state, all of its dependents are notified and updated automatically
* */
import display.DisplayElement;
import observeable.Subject;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current pressure: " + currentPressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
}
