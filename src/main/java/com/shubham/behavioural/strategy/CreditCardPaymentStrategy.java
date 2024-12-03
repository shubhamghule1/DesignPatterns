package com.shubham.behavioural.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    private String creditCardNumber;
    private String name;
    private String cvv;

    public CreditCardPaymentStrategy(String creditCardNumber, String name, String cvv)
    {
        this.creditCardNumber = creditCardNumber;
        this.name = name;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid via Credit Card " + creditCardNumber);
    }
}
