package com.shubham.creational.factory;

public class FactoryTest {
    public static void main(String[] args) {
        try{
            Car abc = CarFactory.buildCar("Abc");
        }catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        Car sedan = CarFactory.buildCar("Sedan");
        sedan.assemble();

        Car suv = CarFactory.buildCar("Suv");
        suv.assemble();

        Car hatchback = CarFactory.buildCar("Hatchback");
        hatchback.assemble();



    }
}
