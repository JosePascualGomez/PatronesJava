package org.example.creational.abstractfactory.methods;

public class Debit implements Method {
    @Override
    public String doPayment() {
        return "Payment debit";
    }
}
