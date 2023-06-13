package org.example.creational.abstractfactory.methods;

public enum MethodType {
    DEBIT("Debit"),
    CREDIT("Credit");

    private String value;

    private MethodType(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
