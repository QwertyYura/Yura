package com.ifmo.lesson1;

    public class IsEven {
        /* Напишите программу, которая выводит true, если число четное и false, если нет. */

        public static void main(String[] args) {
            int a = -8;
            boolean b = isEven(a);
            System.out.print(b);
        }

        public static boolean isEven(int a) {
            return (a%2==0);
        }
    }