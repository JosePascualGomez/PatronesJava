package org.example.behavioral.strategy;

public class LowerStrategyTextFormatter implements StrategyTextFormatter{
    @Override
    public void format(String text) {
        System.out.println("lowercase text " + text.toLowerCase());
    }
}
