package org.example.behavioral.templatemethod;

public class Visa extends Payment{
    @Override
    void initialize() {
        System.out.println("initialize payment with Visa");
    }

    @Override
    void startPayment() {
        System.out.println("starting payment with Visa");
    }

    @Override
    void endPayment() {
        System.out.println("ending payment with Visa");
    }
}
