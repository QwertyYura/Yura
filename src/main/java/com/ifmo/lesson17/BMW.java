package com.ifmo.lesson17;

public class BMW implements Car{

    double engineVolume;
    double rotationFrequency;
    double effectivePressure;

    public BMW(double engineVolume, double rotationFrequency, double effectivePressure) {
        this.engineVolume = engineVolume;
        this.rotationFrequency = rotationFrequency;
        this.effectivePressure = effectivePressure;
    }

    @Override
    public double power() {
        return (engineVolume*rotationFrequency*effectivePressure/120);
    }

    @Override
    public double maxSpeed() {
        return rotationFrequency*2;
    }
}
