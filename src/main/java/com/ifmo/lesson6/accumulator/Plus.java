package com.ifmo.lesson6.accumulator;

public class Plus implements Operation {
    @Override
    public double calculate(double a, double b) {
        return (a+b);
    }
}
