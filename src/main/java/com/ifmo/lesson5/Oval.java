package com.ifmo.lesson5;

public class Oval extends Shape{
    public double a;
    public double b;

    public Oval(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double area(){return 3.14*a*b;}
}
