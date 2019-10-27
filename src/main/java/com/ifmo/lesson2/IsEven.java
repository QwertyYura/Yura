package com.ifmo.lesson2;

public class IsEven {
    /*
    Создать программу, проверяющую и сообщающую на экран, является ли целое число
    записанное в переменную n, чётным либо нечётным.
     */
    public static void main(String[] args) {
        int n = 10;

        boolean even = isEven(n);
        if(even==true){
            System.out.print("Четное");
        }
        else {
            System.out.print("Нечетное");
        }
    }

    public static boolean isEven(int n) {
        if(n%2==0) {
            return true;
        }
        else {
            return false;
        }
    }
}
