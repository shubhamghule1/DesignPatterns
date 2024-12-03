package com.shubham.structural.decorator;

public abstract class ToppingsDecorator implements Pizza{
    private Pizza pizza;
    public ToppingsDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice();
    }
}
