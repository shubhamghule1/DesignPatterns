package com.shubham.structural.decorator;

public class Olives extends ToppingsDecorator{
    public Olives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return "Olives " + super.getDescription() ;
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 20.0;
    }
}
