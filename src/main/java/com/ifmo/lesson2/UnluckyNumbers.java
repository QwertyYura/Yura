package com.ifmo.lesson2;

public class UnluckyNumbers {
    /*
    В американской армии считается несчастливым число 13, а в японской — 4. Перед
    международными учениями штаб российской армии решил исключить номера боевой
    техники, содержащие числа 4 или 13 (например, 40123, 13313, 12345 или 13040), чтобы не
    смущать иностранных коллег. Если в распоряжении армии имеется 100 тыс. единиц боевой
    техники и каждая боевая машина имеет номер от 00001 до 99999, то сколько всего номеров
    придётся исключить?
     */
    public static void main(String[] args) {
        System.out.println(unluckyNumbersCount());
    }

    public static int unluckyNumbersCount() {
        int count=0;
        int number1 = 4;
        int[] number2 = {1, 3};
        int s=100000;
        for (int i = 1; i <s; i++) {
            int a;
            int b=i;
            do{
                a=b%10;
                b=b/10;
                int c=b%10;
                if(a==number1||c==number1||(c==number2[0]&&a==number2[1])){
                    count++;
                    break;
                }
            }
            while (b!=0);
        }
        return count;
    }
}
