package com.bharath.patterns.adapter.task;

public class PaymentAdapter {

    public void pay(int rupees) {
        double rupeesToDollar = rupees * 0.014;
        int unitDollar = (int) rupeesToDollar;

        PaymentProcessor paymentProcessor = new PaymentProcessorImpl();
        paymentProcessor.pay(unitDollar);
    }
}
