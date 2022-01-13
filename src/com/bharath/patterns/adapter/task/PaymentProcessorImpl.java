package com.bharath.patterns.adapter.task;

public class PaymentProcessorImpl implements PaymentProcessor {

    @Override
    public void pay(int dollars) {
        System.out.println("Dollar amount paid: " + dollars);
    }
}
