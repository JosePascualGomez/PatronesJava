package org.example.behavioral.command;


//resider
public class CreditCard {
    public void sendPinNumberToCustomer(){
        System.out.println("The PIN has been sent to the customer");
    }

    public void sendSMSToCustomerActivate(){
        System.out.println("The activation SMS has been sent to the customer. Please contact us if you have not received it.");
    }

    public void activate(){
        System.out.println("The card has been activated");
    }
    public void desactivate(){
        System.out.println("The card has been desactivated");
    }

    public void sendSMSToCustomerDesactivate(){
        System.out.println("The desactivation SMS has been sent to the customer.");
    }

}
