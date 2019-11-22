package com.ifmo.lesson17;

public class Crhysler implements Car {

    double torque;
    double speed;

    public Crhysler(double torque, double speed) {
        this.torque = torque;
        this.speed = speed;
    }

    @Override
    public double power() {
        return (torque*speed/9549);
    }

    @Override
    public double maxSpeed() {
        return (speed*2.5);
    }
}
