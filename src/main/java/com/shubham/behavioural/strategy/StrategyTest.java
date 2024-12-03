package com.shubham.behavioural.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        PaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy("1234-5678-9012", "Shubham Ghule", "001");

        try{
            paymentContext.pay(50);
        }catch(IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        paymentContext.setPaymentContext(creditCardPaymentStrategy);
        paymentContext.pay(50);

        PaymentStrategy upiPaymentStrategy = new UPIPaymentStrategy("shubhamghule@oksbi");
        paymentContext.setPaymentContext(upiPaymentStrategy);
        paymentContext.pay(50);
    }
}
