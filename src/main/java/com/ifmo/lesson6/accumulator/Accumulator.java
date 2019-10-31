package com.ifmo.lesson6.accumulator;

public class Accumulator {
    double value;
    Operation operation;

    Accumulator(double value, Operation operation){
     this.value = value;
     this.operation = operation;
    }

    public void accumulate(double v) {
        value = operation.calculate(value, v);
    }

    public double getValue() {
        return value;
    }
}


