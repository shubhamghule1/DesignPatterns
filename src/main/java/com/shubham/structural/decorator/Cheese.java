package com.shubham.structural.decorator;

public class Cheese extends ToppingsDecorator{
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return  "Cheese " + super.getDescription();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 50.0;
    }
}
