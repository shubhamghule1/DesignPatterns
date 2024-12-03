package com.shubham.structural.decorator;

public class ThinCrustPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Thin Crust Pizza";
    }

    @Override
    public Double getPrice() {
        return 100.0;
    }
}
