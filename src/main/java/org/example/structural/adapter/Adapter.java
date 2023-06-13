package org.example.structural.adapter;

public class Adapter implements Payment{
    private Secure secureCreditCard;

    public Adapter(String type) {
        if(type.equals("black")) {
            this.secureCreditCard = new BlackCreditCard();
        }else if (type.equals("gold")){
            this.secureCreditCard = new GoldCreditCard();
        }
    }

    @Override
    public void pay(String type) {
        if(type.equals("black")) {
            this.secureCreditCard.payWithSecureLevelA();
        }else if (type.equals("gold")){
            this.secureCreditCard.payWithSecureLevelZ();
        }
    }
}
