package com.shubham.creational.factory;

public class HatchBack implements Car {
    @Override
    public void assemble() {
        System.out.println("HatchBack assembled...");
    }
}
