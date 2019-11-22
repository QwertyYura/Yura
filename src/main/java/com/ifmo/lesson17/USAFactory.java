package com.ifmo.lesson17;

public class USAFactory extends Factory {

    @Override
    public Car createCar() {
        return new Crhysler(23,23) {
        };
    }
}
