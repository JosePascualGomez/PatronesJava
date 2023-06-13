package org.example.behavioral.visitor;

public class ClassicCreditCardVisitor implements CreditCardVisitor{
    @Override
    public void gasolineOffer(GasolineOffer gasolineOffer) {
        System.out.println("3% discount on gasoline with your classic card");
    }

    @Override
    public void flightOffer(FlightOffer flightOffer) {
        System.out.println("5% discount on flight with your classic card");
    }
}
