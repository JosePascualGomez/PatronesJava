package org.example.creational.factorymethod;

public class CardPayment implements Payment{
    @Override
    public void doPayment() {
        System.out.println("Estoy desde Tarjeta de pago");
    }
}
