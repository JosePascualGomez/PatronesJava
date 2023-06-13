package org.example.behavioral.visitor;

public interface ElementOffer {
    void accept(CreditCardVisitor visitor);
}
