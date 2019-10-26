package com.ifmo.lesson5;

public class Triangle extends Shape{
    public double a;
    public double b;

    public Triangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double area(){return 0.5*a*b;}
}
