package org.example.structural.adapter;

public class GoldCreditCard implements Secure{
    @Override
    public void payWithSecureLevelA() {

    }

    @Override
    public void payWithSecureLevelZ() {
        System.out.println("gold Card: Paying with low security level Z");
    }
}
