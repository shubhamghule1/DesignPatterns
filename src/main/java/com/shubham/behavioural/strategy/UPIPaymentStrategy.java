package com.shubham.behavioural.strategy;

public class UPIPaymentStrategy implements PaymentStrategy {
    private String upiId;
    public UPIPaymentStrategy(String upiId)
    {
        this.upiId = upiId;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+ " payed by UPI ID: " + upiId);
    }
}
