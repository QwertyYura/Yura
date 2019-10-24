package com.ifmo.lesson3;

public class EvenArray {
    /*
    Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран
    сначала в строку, отделяя один элемент от другого пробелом, а затем в столбик (отделяя один
    элемент от другого началом новой строки). Перед созданием массива подумайте, какого он
    будет размера.2 4 6 … 18 20246…20
     */
    public static void main(String[] args) {
        int[] evenArray = evenArray();
    }

    public static int[] evenArray() {
        int c=20/2;
        int j=0;
        int[] evenArray=new int[c];
        int number=20;
        for (int i = 1; i <= number; i++) {
            if(i%2==0) {
                evenArray[j] = i;
                j++;
            }
            }
        for (int k = 0; k < evenArray.length; k++) {
            System.out.print(evenArray[k]+" ");
        }
        System.out.print("\n");
        for (int l = 0; l < evenArray.length; l++) {
            System.out.println(evenArray[l]);
        }
        return null;
    }
}
