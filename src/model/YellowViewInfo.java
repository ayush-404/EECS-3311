package model;

import java.util.ArrayList;
import java.util.List;

public class YellowViewInfo implements Subject{
    private String state;
    private final List<Observer> observers;

    public YellowViewInfo() {
        observers = new ArrayList<>();
    }
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public String notifyObserver(Observer validObserver) {
        if(observers.contains(validObserver)) {
            return state;
        }
        return null;
    }

    public void update(String newState) {
        state = newState;
        for(Observer o : observers) {
            notifyObserver(o);
        }
    }

    public String getState() {
        return state;
    }
}
