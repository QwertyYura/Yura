package com.ifmo.lesson3;

public class Random15 {
    /*
     Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
     Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на
     отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i]+" ");
        }

        int evens = evens(randomNumbers);
        System.out.print("\n"+"Количество четных элементов в массиве: "+evens);
    }

    public static int[] randomNumbers() {
        int[] rnd = new int[15];

        for (int i = 0; i < rnd.length; i++) {
            int a = (int)(Math.random()*10);
            rnd[i] = a;
        }
        return rnd;
    }

    private static int evens(int[] randomNumbers) {
        int count=0;
        for (int i = 0; i < randomNumbers.length; i++) {
            if(randomNumbers[i]%2==0){
                count++;
            }
        }
        return count;
    }
}
