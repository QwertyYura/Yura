package com.ifmo.lesson2;

public class IsEven {
    /*
    Создать программу, проверяющую и сообщающую на экран, является ли целое число
    записанное в переменную n, чётным либо нечётным
     */
    public static void main(String[] args) {
        int n = 120;

        boolean even = isEven(n);
        if(even==true){
            System.out.print("Число "+n+" четное");
        }
        else {
            System.out.print("Число "+n+" нечетное");
        }
    }

    public static boolean isEven(int n) {
         return (n%2==0);
    }
}
