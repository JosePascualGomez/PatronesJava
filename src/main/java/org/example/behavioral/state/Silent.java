package org.example.behavioral.state;

public class Silent implements MobileAlertState{
    @Override
    public void alert(MobileAlertStateContext context) {
        System.out.println("Silent...");
    }
}
