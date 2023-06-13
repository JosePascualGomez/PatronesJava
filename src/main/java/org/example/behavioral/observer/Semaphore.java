package org.example.behavioral.observer;

public class Semaphore {
    public States status;

    public Semaphore(States status){
        this.status= status;
    }

    public States getStatus(){
        return status;
    }
}
