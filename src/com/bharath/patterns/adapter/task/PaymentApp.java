package com.bharath.patterns.adapter.task;

public class PaymentApp {

    public void showDollarsAmount(int rupees) {
        PaymentAdapter paymentAdapter = new PaymentAdapter();
        paymentAdapter.pay(rupees);
    }
}
