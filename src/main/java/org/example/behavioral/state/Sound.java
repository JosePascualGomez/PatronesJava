package org.example.behavioral.state;

public class Sound implements MobileAlertState{
    @Override
    public void alert(MobileAlertStateContext context) {
        System.out.println("Sound..");
    }
}
