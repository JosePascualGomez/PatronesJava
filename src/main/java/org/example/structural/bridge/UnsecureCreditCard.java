package org.example.structural.bridge;

public class UnsecureCreditCard implements ICreditCard{

    @Override
    public void makePayment() {
        System.out.println("paying without security");
    }
}
