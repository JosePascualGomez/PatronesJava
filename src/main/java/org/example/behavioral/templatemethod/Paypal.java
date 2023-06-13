package org.example.behavioral.templatemethod;

public class Paypal extends Payment{
    @Override
    void initialize() {
        System.out.println("initialize payment with Paypal");
    }

    @Override
    void startPayment() {
        System.out.println("starting payment with Paypal");
    }

    @Override
    void endPayment() {
        System.out.println("ending payment with Paypal");
    }
}
