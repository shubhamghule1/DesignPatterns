package com.shubham.structural.decorator;


public class Paneer extends ToppingsDecorator{
    public Paneer(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return "Paneer " + super.getDescription() ;
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 80.0;
    }
}
