package org.example.creational.abstractfactory.cards;

public class MasterCard implements Card {
    @Override
    public String getCardType() {
        return CardType.MASTERCARD.getValue();
    }

    @Override
    public String getCardNumber() {
        return "1111 11 11 MasterCard";
    }
}
