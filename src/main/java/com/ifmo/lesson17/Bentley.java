package com.ifmo.lesson17;

public class Bentley implements Car{

    double airConsumption;
    double rotation;

    public Bentley(double airConsumption,double rotation) {
        this.airConsumption = airConsumption;
        this.rotation = rotation;
    }

    @Override
    public double power() {
        return (airConsumption *rotation/16500);
    }

    @Override
    public double maxSpeed() {
        return rotation*3;
    }
}
