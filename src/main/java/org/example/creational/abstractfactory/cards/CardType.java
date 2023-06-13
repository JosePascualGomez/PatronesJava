package org.example.creational.abstractfactory.cards;

public enum CardType {
    VISA("Visa"),
    MASTERCARD("MasterCard");

    private String value;
    private CardType(String value) {
        this.value =  value;
    }

    public String getValue(){
        return value;
    }
}
