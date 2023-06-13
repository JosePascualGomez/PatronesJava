package org.example.behavioral.strategy;

public class CapitalStrategyTextFormatter implements StrategyTextFormatter{
    @Override
    public void format(String text) {
        System.out.println("capital text " + text.toUpperCase());
    }
}
