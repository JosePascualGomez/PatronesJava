package org.example.creational.prototype;

public class Visa implements PrototypeCard{

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getCard() {
        System.out.println("This is visa card");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("cloned visa card");
        return (Visa) super.clone();
    }
}
