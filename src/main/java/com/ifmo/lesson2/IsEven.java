package com.ifmo.lesson2;

public class IsEven {
    /*
    Создать программу, проверяющую и сообщающую на экран, является ли целое число
    записанное в переменную n, чётным либо нечётным.
     */
    public static void main(String[] args) {
        int n = 121;

        String even = isEven(n);

        System.out.println(even);
    }

    public static String isEven(int n) {
        int a = n%2;
        if(a==0) {
            return "Четное";
        }
        else {
            return "Нечетное";
        }
    }
}
