package com.ifmo.lesson3;

public class Fibonacci20 {
    /*
    Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем,
    что первый и второй члены последовательности равны единицам, а каждый следующий —
    сумме двух предыдущих.
     */
    public static void main(String[] args) {
        int[] fibonacciNumbers = fibonacciNumbers();

        for (int i = 0; i < fibonacciNumbers.length; i++) {
            System.out.print(fibonacciNumbers[i]+" ");
        }
    }

    public static int[] fibonacciNumbers() {
        int n=20;
        int [] number = new int[n];
        int f1=0;
        int f2=1;
        int f3;
        for (int i = 0; i < n; i++) {
            f3=f1+f2;
            if(f3==1) {
                number[i] = f3;
                i++;
            }
            number[i]=f3;
            f1=f2;
            f2=f3;
        }
        return number;
    }
}
