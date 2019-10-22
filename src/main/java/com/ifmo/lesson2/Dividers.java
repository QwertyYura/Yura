package com.ifmo.lesson2;

import java.util.Scanner;

public class Dividers {
    /*
    Выведите на экран все положительные делители натурального числа, введённого
    пользователем с клавиатуры.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int c=n;
        for (int i = 1; i <n; i++) {
            if(n%i==0){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
