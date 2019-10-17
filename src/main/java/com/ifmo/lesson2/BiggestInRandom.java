package com.ifmo.lesson2;

import java.util.Random;

public class BiggestInRandom {
    /*
     Создать программу, выводящую на экран случайно сгенерированное трёхзначное
     натуральное число и его наибольшую цифру.Примеры работы программы:
     В числе 208 наибольшая цифра 8.
     В числе 774 наибольшая цифра 7.
     В числе 613 наибольшая цифра 6.
     */
    public static void main(String[] args) {
        int rnd = threeDigitRandom();

        String largestDigit = largestDigit(rnd);

        System.out.println(largestDigit);
    }

    public static int threeDigitRandom() {
        int a = (int)(Math.random()*(999-100)+100);
        return(a);
    }

    public static String largestDigit(int rnd) {
        int max=0;
        int c=rnd;
        for (int i = 0; i <3 ; i++) {
            int b=c%10;
            c=c/10;
            if(b>max) {
                max = b;
            }
            }
        return "В числе " + rnd + " наибольшая цифра " + max + ".";
        }
}
