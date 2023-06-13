package org.example.structural.decorator;

public class Black implements Credit{
    @Override
    public void showCredit() {
        System.out.println("The credit is of 1.000.000");
    }
}
