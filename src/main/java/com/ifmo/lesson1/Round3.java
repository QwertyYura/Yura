package com.ifmo.lesson1;

public class Round3 {
    /* В переменной n хранится вещественное число с ненулевой дробной частью.
       Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран..
     */
    public static void main(String[] args) {
        double n = 3121212.54666;
        round(n);
    }

    public static void round(double n) {

        double a=(int)n;
        double r=Math.abs(n-a);
        if(r>0.5){
            if(n>0) {
                a++;
            }
            if(n<0) {
                a--;
            }
        };
        n=a;

        System.out.print(n);
    }
}
