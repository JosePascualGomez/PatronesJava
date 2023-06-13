package org.example.behavioral.visitor;

public class GasolineOffer implements ElementOffer{
    @Override
    public void accept(CreditCardVisitor visitor) {
        visitor.gasolineOffer(this);
    }
}
