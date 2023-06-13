package org.example.structural.bridge;

public class SecureCreditCard implements ICreditCard{

    @Override
    public void makePayment() {
        System.out.println("paying with security");
    }
}
