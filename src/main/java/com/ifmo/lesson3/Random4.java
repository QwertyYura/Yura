package com.ifmo.lesson3;

import java.util.Arrays;

public class Random4 {
    /*
    Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в
    строку. Определить и вывести на экран сообщение о том, является ли массив строго
    возрастающей последовательностью.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i]+" ");
        }
        boolean out = isIncreasingSequence(randomNumbers);

        System.out.print("\n" + (out==true));
    }

    public static int[] randomNumbers() {
        int[] random = new int[4];
        for (int i = 0; i < random.length; i++) {
            int a = (int)(Math.random()*(99+1-10)+10);
            random[i] = a;
        }
        return random;
    }

    public static boolean isIncreasingSequence(int[] randomNumbers) {
        int[] clone = randomNumbers.clone();
        Arrays.sort(clone);

        return ((Arrays.equals(randomNumbers,clone))==true);
    }
}
