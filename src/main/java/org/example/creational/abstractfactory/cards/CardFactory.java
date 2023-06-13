package org.example.creational.abstractfactory.cards;

import org.example.creational.abstractfactory.AbstractFactory;

public class CardFactory implements AbstractFactory<Card> {

    @Override
    public Card create(String type) {
        if(CardType.VISA.getValue().equals(type)){
            return  new Visa();
        }else if(CardType.MASTERCARD.getValue().equals(type)){
            return  new MasterCard();
        }
        return null;
    }
}
