package org.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject{
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void dettach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyUpdate(Semaphore semaphore) {
        for (Observer observer: observers) {
            observer.update(semaphore);
        }
    }
}
