package org.example.behavioral.observer;

public class Car implements Observer{
    @Override
    public void update(Semaphore semaphore) {
        if (semaphore.status.equals(States.CAR_RED)){
            System.out.println("semaphore red for CAR => car NOT CAN pass");
        }else {
            System.out.println("semaphore green for car => car can pass");
        }
    }
}
