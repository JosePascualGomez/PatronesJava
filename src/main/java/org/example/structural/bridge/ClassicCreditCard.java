package org.example.structural.bridge;

public class ClassicCreditCard extends CreditCard{
    public ClassicCreditCard(ICreditCard card) {
        super(card);
    }

    @Override
    public void makePayment() {
        card.makePayment();
    }
}
