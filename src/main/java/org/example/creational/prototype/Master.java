package org.example.creational.prototype;

public class Master implements PrototypeCard{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getCard() {
        System.out.println("This is master card");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("cloned master card");
        return (Master) super.clone();
    }
}
