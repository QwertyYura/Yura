package com.ifmo.lesson1;

public class TwoDigitsSum {
    /*
   В переменной n хранится натуральное двузначное число.
   Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
    */
    public static void main(String[] args) {
        int n = 99;

        int sum = sum(n);

        System.out.println(sum);
    }

    public static int sum(int n) {

        int r=n/10;
        int q=n%10;
        n=r+q;

        if(r>0&&r<10)
        {
            return(n);
        }

        return 0;
    }
}