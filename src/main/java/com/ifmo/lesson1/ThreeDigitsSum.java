package com.ifmo.lesson1;

public class ThreeDigitsSum {
    /* В переменной n хранится натуральное трехзначное число. Создайте
       программу, вычисляющую и выводящую на экран сумму цифр числа n
     */
    public static void main(String[] args) {
        int n = 152;
        sum(n);
        n = sum(n);
        System.out.print(n);
    }

    public static int sum(int n) {
        int r = n / 100;
        int q = n % 100;
        int a = q / 10;
        int b = q % 10;
        n = r + a + b;

        return (n);
    }
}