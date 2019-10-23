package com.ifmo.lesson2;

import java.util.Arrays;

public class SquareEquation {
    /*
     В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
     будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
     либо сообщать, что корней нет.
     */
    public static void main(String[] args) {
        double a = 10;
        double b = 20;
        double c = 1;

        double[] roots = squareEquationRoots(a, b, c);
        if (roots[0]!=0&&roots[1]!=0) {
            System.out.println(Arrays.toString(roots));
        }
        else {
            System.out.print("Корней нет!");
        }
    }

    /*
    Возвращает массив из двух корней или null, если таковых нет.
     */
    public static double[] squareEquationRoots(double a, double b, double c) {
        double[] root12 = new double[2];
        int count=0;
        double D=b*b - 4 * a * c;
        if (D >= 0) {
            root12[0]=((0-b)+Math.sqrt(D))/(2*a);
            root12[1]=((0-b)-Math.sqrt(D))/(2*a);
            c++;
        }
        if(c>0){
            return root12;
        }
        else {
            return null;
        }
    }
}
