package com.ifmo.lesson17;

public class GBFactory extends Factory {
    @Override
    public Car createCar() {
        return new Bentley(100,66);
    }
}
