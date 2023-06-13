package org.example.structural.decorator;

public class SecureDecorator extends CreditDecorator{
    public SecureDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit(){
        decoratedCredit.showCredit();
        ConfigSecure();
    }

    private void ConfigSecure(){
        System.out.println("The card was configured with security");
    }
}
