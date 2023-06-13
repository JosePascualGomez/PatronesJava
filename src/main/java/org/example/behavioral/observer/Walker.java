package org.example.behavioral.observer;

public class Walker implements Observer{
    @Override
    public void update(Semaphore semaphore) {
        if (semaphore.status.equals(States.CAR_RED)){
            System.out.println("semaphore green for walker => walker can pass");
        }else {
            System.out.println("semaphore red for walker => walker NOT CAN pass");
        }
    }
}
