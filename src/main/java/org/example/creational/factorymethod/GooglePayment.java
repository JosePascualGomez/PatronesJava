package org.example.creational.factorymethod;

public class GooglePayment implements Payment{
    @Override
    public void doPayment() {
        System.out.println("Estoy pagando desde Google Payment");
    }
}
