package org.example.structural.bridge;

public abstract class CreditCard {
    protected ICreditCard card;

    public CreditCard(ICreditCard card) {
        this.card = card;
    }

    public abstract void makePayment();
}
