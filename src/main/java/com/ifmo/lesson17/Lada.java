package com.ifmo.lesson17;

public class Lada implements Car{

    double weight;
    double time;
    double speed;

    public Lada(double weight, double time, double speed) {
        this.weight = weight;
        this.time = time;
        this.speed = speed;
    }

    @Override
    public double power() {
        return (weight*0.93/time);
    }

    @Override
    public double maxSpeed() {
        return speed;
    }
}
