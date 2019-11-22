package com.ifmo.lesson17;

public class RussianFactory extends Factory {
    @Override
    public Car createCar() {
        return new Lada(34,34,34);
    }
}
