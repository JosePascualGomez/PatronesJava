package org.example.behavioral.observer;

public interface Subject {
    void attach(Observer observer);
    void dettach(Observer observer);
    void notifyUpdate(Semaphore semaphore);
}
