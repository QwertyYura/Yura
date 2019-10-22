package com.ifmo.lesson2;

public class First20 {
    /*
     Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8
     16 32 64 128 ….
     */
    public static void main(String[] args) {
        int number=20;
        int c=1;
        for (int i = 0; i < number; i++) {
            c=c*2;
            System.out.print(c);
            System.out.print(" ");
        }
    }
}
