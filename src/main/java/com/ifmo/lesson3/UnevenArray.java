package com.ifmo.lesson3;

public class UnevenArray {
    /*
    Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем
    этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3
    1)
     */
    public static void main(String[] args) {
        int[] unevenArray = unevenArray();
        for (int i = 0; i < unevenArray.length; i++) {
            System.out.print(unevenArray[i]+" ");
        }
        System.out.print("\n");

        for (int j = unevenArray.length-1; j>=0; j--) {
            System.out.print(unevenArray[j]+" ");
        }
    }

    public static int[] unevenArray() {
        int[] numbers = new int[50];
        int k = 1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = k;
            k = k+2;
        }
        return numbers;
    }
}
