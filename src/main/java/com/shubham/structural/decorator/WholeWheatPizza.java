package com.shubham.structural.decorator;

public class WholeWheatPizza implements Pizza {
    @Override
    public Double getPrice() {
        return 120.0;
    }

    @Override
    public String getDescription() {
        return "Whole Wheat Pizza";
    }
}
