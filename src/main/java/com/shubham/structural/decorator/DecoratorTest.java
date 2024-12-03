package com.shubham.structural.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Pizza pizza = new Olives(new Paneer(new Cheese(new ThinCrustPizza())));
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getPrice());
        Pizza pizza2 = new Olives(new Paneer(new WholeWheatPizza()));
        System.out.println(pizza2.getDescription());
        System.out.println(pizza2.getPrice());
    }
}
