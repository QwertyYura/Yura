package com.ifmo.lesson2;

import java.util.Scanner;

public class PrimeNumber {
    /*
    Проверьте, является ли введённое пользователем с клавиатуры натуральное число —
    простым. Постарайтесь не выполнять лишних действий (например, после того, как вы нашли
    хотя бы один нетривиальный делитель уже ясно, что число составное и проверку продолжать
    не нужно). Также учтите, что наименьший делитель натурального числа n, если он вообще
    имеется, обязательно располагается в отрезке [2; √n].

    1 не считается простым числом.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        boolean prime = isPrime(n);

        if(prime==true){
            System.out.print("Число "+ n + " простое!");
        }
        else {
            System.out.print("Число "+ n + " не является простым!");
        }
    }

    public static boolean isPrime(int n) {
        int c=0;
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(n%i==0){
                c++;
            }
        }
        if(c>0||n<2){
            return false;
        }
        else {
            return true;
        }
    }
}
