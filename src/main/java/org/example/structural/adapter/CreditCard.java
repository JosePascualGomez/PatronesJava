package org.example.structural.adapter;

public class CreditCard implements Payment{
    Adapter adapter;
    @Override
    public void pay(String type) {
        if(type.equals("classic")){
            System.out.println("classic Card: Paying without security level");
        }else if (type.equals("gold") || type.equals("black")){
            adapter = new Adapter(type);
            adapter.pay(type);
        }else{
            System.out.println("Paying with unknown card");
        }
    }
}
