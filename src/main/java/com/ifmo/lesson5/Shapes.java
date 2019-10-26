package com.ifmo.lesson5;

public class Shapes {
    public static void main(String[] args) {
        double totalArea = totalArea(
                new Rectangle(10, 15),
                new Square(23),
                new Triangle(20,5.6),
                new Oval(1.2,5.78),
                new Circle(3));

        System.out.println(totalArea);
    }

    public static double totalArea(Shape... shapes) {
        double sum = 0;

        for (Shape shape : shapes) {
            sum += shape.area();
        }

        return sum;
    }
}
