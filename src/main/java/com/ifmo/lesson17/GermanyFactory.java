package com.ifmo.lesson17;

public class GermanyFactory extends Factory {
    @Override
    public Car createCar() {
        return new BMW(23,22,2);
    }
}
