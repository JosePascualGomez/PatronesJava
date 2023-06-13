package org.example.behavioral.visitor;

public interface CreditCardVisitor {
    void gasolineOffer(GasolineOffer gasolineOffer);
    void flightOffer(FlightOffer flightOffer);
}
