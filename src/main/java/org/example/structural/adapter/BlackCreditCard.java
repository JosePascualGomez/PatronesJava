package org.example.structural.adapter;

public class BlackCreditCard implements Secure{
    @Override
    public void payWithSecureLevelA() {
        System.out.println("Black Card: Paying with high security level A");
    }

    @Override
    public void payWithSecureLevelZ() {

    }
}
