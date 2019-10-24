package com.ifmo.lesson3;

public class Random12 {
    /*
    Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой
    элемент является в этом массиве максимальным и сообщите индекс его последнего
    вхождения в массив.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i]+" ");
        }

        System.out.print("\n");
        int max = max(randomNumbers);
        System.out.print("Максимальный элемент массива: "+max+"\n");

        int maxLastIndex = lastIndexOf(randomNumbers, max);
        System.out.print("Индекс максимального элемента массива: "+maxLastIndex);

    }

    public static int[] randomNumbers() {
        int[] number = new int[12];

        for (int i = 0; i < number.length; i++) {
            int rnd = (int)(Math.random()*(16+16)-16);
            number[i]=rnd;
        }
        return number;
    }

    public static int max(int[] randomNumbers) {
        int m = randomNumbers[0];

        for (int i = 0; i < randomNumbers.length; i++) {
            if(randomNumbers[i]>m){
                m=randomNumbers[i];
            }
        }
        return m;
    }

    public static int lastIndexOf(int[] randomNumbers, int max) {

        for (int i = randomNumbers.length-1; i>=0; i--) {
            if (randomNumbers[i]==max){
                return i;
            }
        }
        return 0;
    }
}
