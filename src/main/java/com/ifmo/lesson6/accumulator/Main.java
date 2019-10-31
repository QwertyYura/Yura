package com.ifmo.lesson6.accumulator;

public class Main {
    public static void main(String[] args) {
        Accumulator plusAcc = new Accumulator(0, new Plus());
        Accumulator minusAcc = new Accumulator(100, new Minus());
        Accumulator divideAcc = new Accumulator(20, new Divide());

        plusAcc.accumulate(10);
        System.out.println(plusAcc.getValue());
        plusAcc.accumulate(20);
        System.out.println(plusAcc.getValue());

        minusAcc.accumulate(10);
        System.out.println(minusAcc.getValue());
        minusAcc.accumulate(100);
        System.out.println(minusAcc.getValue());

        divideAcc.accumulate(10);
        System.out.println(divideAcc.getValue());
        divideAcc.accumulate(2);
        System.out.println(divideAcc.getValue());

        plusAcc.accumulate(10);
        System.out.println(plusAcc.getValue());
    }
}
