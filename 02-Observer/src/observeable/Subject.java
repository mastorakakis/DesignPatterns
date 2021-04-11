package observeable;

import observer.Observer;

public interfaces Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
