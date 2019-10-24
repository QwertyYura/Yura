package com.ifmo.lesson3;

public class Random8 {
    /*
    Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран
    в строку. Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на
    экран на отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i]+" ");
        }

        int[] replacedWithZeros = replaceWithZeros(randomNumbers);
        System.out.print("\n");
        for (int j = 0; j < replacedWithZeros.length; j++) {
            System.out.print(replacedWithZeros[j]+" ");
        }
    }

    public static int[] randomNumbers() {
        int[] rd = new int[8];
        for (int i = 0; i < rd.length; i++) {
            int rnd = (int)(Math.random()*(10-1)+1);
            rd[i]=rnd;
        }
        return rd;
    }

    public static int[] replaceWithZeros(int[] randomNumbers) {
        for (int i = 0; i < randomNumbers.length; i++) {
            if(i%2!=0) {
                randomNumbers[i] = 0;
            }
        }
        return randomNumbers;
    }
}
