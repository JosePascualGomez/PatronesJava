package org.example.structural.decorator;

public class Gold implements Credit{
    @Override
    public void showCredit() {
        System.out.println("The credit is of 50.000");
    }
}
