package com.ifmo.lesson1;

public class ThreeDigitsSum {
    /* В переменной n хранится натуральное трехзначное число. Создайте
       программу, вычисляющую и выводящую на экран сумму цифр числа n
     */
    public static void main(String[] args) {
        int n = 200;
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

        if(r<1||r>=10){
            n=0;
        }

        return (n);
    }
}