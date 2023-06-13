package org.example.behavioral.mediator;

public class ConcreteColleage1 extends Colleage{
    public ConcreteColleage1(Mediator mediator) { super(mediator); }

    @Override
    public void send(String message) { mediator.send(message, this); }

    @Override
    public void messageReceived(String message) {
        System.out.println("The Colleage1 has received the message => " + message);
    }
}
