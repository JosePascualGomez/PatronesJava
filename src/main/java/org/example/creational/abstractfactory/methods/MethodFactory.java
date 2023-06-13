package org.example.creational.abstractfactory.methods;

import org.example.creational.abstractfactory.AbstractFactory;

public class MethodFactory implements AbstractFactory<Method> {

    @Override
    public Method create(String type) {
        if(MethodType.DEBIT.getValue().equals(type)){
            return new Debit();
        }else if(MethodType.CREDIT.getValue().equals(type)){
            return new Credit();
        }
        return null;
    }
}
