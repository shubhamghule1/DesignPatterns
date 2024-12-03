package com.shubham.behavioural.strategy;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    public PaymentContext() {}
    public void setPaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount) {
        if(paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set!");
        }
        paymentStrategy.pay(amount);
    }
}
