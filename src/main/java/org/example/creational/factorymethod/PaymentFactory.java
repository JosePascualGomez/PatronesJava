package org.example.creational.factorymethod;

public class PaymentFactory {

    public static Payment buildPayment(PaymentType typePayment){
        switch (typePayment){
            case GOOGLE_PAY:
                return new GooglePayment();
            case CARD:
                return new CardPayment();
            default:
                return new CardPayment();
        }
    }
}
