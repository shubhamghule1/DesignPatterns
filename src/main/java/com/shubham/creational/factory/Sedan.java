package com.shubham.creational.factory;

public class Sedan implements Car {
    @Override
    public void assemble() {
        System.out.println("Sedan assembled...");
    }
}
