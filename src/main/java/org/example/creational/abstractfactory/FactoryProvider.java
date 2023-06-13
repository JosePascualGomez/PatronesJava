package org.example.creational.abstractfactory;

import org.example.creational.abstractfactory.cards.CardFactory;
import org.example.creational.abstractfactory.methods.MethodFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String chooseFactory){
        if (FactoryType.CARDS.getValue().equals(chooseFactory)){
            return new CardFactory();
        }else if (FactoryType.METHODS.getValue().equals(chooseFactory)){
            return new MethodFactory();
        }
        return null;
    }
}
