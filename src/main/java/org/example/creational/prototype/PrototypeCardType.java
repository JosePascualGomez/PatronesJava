package org.example.creational.prototype;

public enum PrototypeCardType {
    VISA ("visa"),
    MASTER ("master");


    private String value;
    private PrototypeCardType(String value){
        this.value = value;
    }

    public String getValue(){return value;}
}
