package org.example.creational.abstractfactory.cards;

public class Visa implements Card {
    @Override
    public String getCardType() {
        return CardType.VISA.getValue();
    }

    @Override
    public String getCardNumber() {
        return "0000 00 0000 Visa";
    }
}
