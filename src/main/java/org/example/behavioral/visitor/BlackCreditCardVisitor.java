package org.example.behavioral.visitor;

public class BlackCreditCardVisitor implements CreditCardVisitor{
    @Override
    public void gasolineOffer(GasolineOffer gasolineOffer) {
        System.out.println("10% discount on gasoline with your black card");
    }

    @Override
    public void flightOffer(FlightOffer flightOffer) {
        System.out.println("20% discount on flight with your black card");
    }
}
