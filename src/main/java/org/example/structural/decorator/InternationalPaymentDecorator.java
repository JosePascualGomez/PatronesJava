package org.example.structural.decorator;

public class InternationalPaymentDecorator extends CreditDecorator{
    public InternationalPaymentDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit(){
        decoratedCredit.showCredit();
        ConfigInternationalPayment();
    }

    private void ConfigInternationalPayment(){
        System.out.println("The card was configured to make international payments");
    }
}
