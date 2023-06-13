package org.example.behavioral.visitor;

public class FlightOffer implements ElementOffer{
    @Override
    public void accept(CreditCardVisitor visitor) {
        visitor.flightOffer(this);
    }
}
