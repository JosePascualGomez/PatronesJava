package org.example.structural.composite;

public class CurrentAccount implements AccountComponent{
    private Double amount;
    private String name;

    public CurrentAccount(Double amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void showAccountName() {
        System.out.println("Current Account " + name);
    }

    @Override
    public Double getAmount() {
        return amount;
    }
}
