package com.ifmo.lesson2;

public class ClosestToTen {
    /*
     Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в
     переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
     */
    public static void main(String[] args) {
        float m = 9.8885f;
        float n = 170.45f;

        float closestToTen = closestToTen(m, n);

        System.out.println("Ближайшее к 10 число "+closestToTen);
    }

    public static float closestToTen(float m, float n) {

        float x=m-10;
        float y=n-10;
        if(Math.abs(x)>Math.abs(y)){
            return (n);
        }
        else {
            return (m);
        }
    }
}
