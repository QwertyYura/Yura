package com.ifmo.lesson2;

public class Fibonacci {
    /*
     Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что
     первый и второй члены последовательности равны единицам, а каждый следующий — сумме
     двух предыдущих.
     */
    public static void main(String[] args) {
        int n=11;
        int f1=0;
        int f2=1;
        int f3;
        for (int i = 0; i < n-1; i++) {
            f3=f1+f2;
            if(f3==1) {
                System.out.print(f3);
                System.out.print(" ");
            }
            System.out.print(f3);
            System.out.print(" ");
            f1=f2;
            f2=f3;
            }
        }
    }
