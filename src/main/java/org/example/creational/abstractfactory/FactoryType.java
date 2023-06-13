package org.example.creational.abstractfactory;

public enum FactoryType {
    CARDS("cards"),
    METHODS("methods");

    private String value;
    private FactoryType(String value){
        this.value = value;
    }

    public String getValue(){return value;}

}
