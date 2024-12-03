package com.shubham.creational.factory;

public class CarFactory {
    public static Car buildCar(String carType) {
        if(carType == null || carType.isEmpty()) {
            return null;
        }
        return switch (carType.toLowerCase()) {
            case "sedan" -> new Sedan();
            case "hatchback" -> new HatchBack();
            case "suv" -> new Suv();
            default -> throw new IllegalArgumentException("Invalid car type!!!");
        };



    }
}
