package com.ifmo.lesson1;

    public class IsEven {
        /* Напишите программу, которая выводит true, если число четное и false, если нет. */
        public static void main(String[] args) {
            int a = 2;
            boul(a);
            System.out.print(boul(a));
        }

        public static boolean boul(int a) {
            return (a%2==0);
        }
    }