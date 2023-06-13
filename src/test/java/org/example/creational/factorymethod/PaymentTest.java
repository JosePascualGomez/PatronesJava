package org.example.creational.factorymethod;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    static void doPayment() {
        Payment payment = PaymentFactory.buildPayment(PaymentType.CARD);
        payment.doPayment();
        assertEquals(true,true);
    }
}