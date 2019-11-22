package com.ifmo.lesson17;

public class MainCar {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory("RUS");
       // factory = Factory.getFactory("USA");
        Car car = factory.createCar();
        System.out.println(car.maxSpeed());
    }
}
