package com.ifmo.lesson17;

public class Toyota implements Car{

    double torque;
    double speed;

    Toyota(double torque, double speed){
        this.torque = torque;
        this.speed = speed;
    }

    @Override
    public double power() {
        return (torque*speed/9549);
    }

    @Override
    public double maxSpeed() {
        return (speed*1.5);
    }
}
