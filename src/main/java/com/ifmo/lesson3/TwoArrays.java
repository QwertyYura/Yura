package com.ifmo.lesson3;

public class TwoArrays {
    /*
     Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите
     массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов
     каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо
     сообщите, что их средние арифметические равны)
     */
    public static void main(String[] args) {
        int[] randomNumbers1 = randomNumbers();
        int[] randomNumbers2 = randomNumbers();

        System.out.print("Первый массив: ");
        for (int i = 0; i < randomNumbers1.length; i++) {
            System.out.print(randomNumbers1[i]+" ");
        }
        System.out.print("\n");

        System.out.print("Второй массив: ");
        for (int i = 0; i < randomNumbers2.length; i++) {
            System.out.print(randomNumbers2[i]+" ");
        }
        System.out.print("\n");


        float average1 = average(randomNumbers1);
        float average2 = average(randomNumbers2);

        System.out.print("Среднеарифметическое элементов первого массива: "+average1+"\n");
        System.out.print("Среднеарифметическое элементов второго массива: "+average2+"\n");

        if(average1>average2){
            System.out.print("Среднеарифметическое элементов первого массива больше среднеарифметического элементов второго массива");
        }
        else {
            System.out.print("Среднеарифметическое элементов второго массива больше среднеарифметического элементов первого массива");

        }

        if(average1==average2){
            System.out.print("Среднеарифметическое элементов первого массива равно среднеарифметическому элементов второго массива");
        }

    }

    public static int[] randomNumbers() {
        int[] ran = new int[5];
        for (int i = 0; i < ran.length ; i++) {
            int r = (int)(Math.random()*6);
            ran[i] = r;
        }
        return ran;
    }

    public static float average(int[] randomNumbers) {
        float sum = 0;

        for (int i = 0; i < randomNumbers.length; i++) {
            sum = sum+randomNumbers[i];
        }
        float aver = sum/randomNumbers.length;
        return aver;
    }
}
