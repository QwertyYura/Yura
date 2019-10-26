package com.ifmo.lesson2;

public class FloatRound {
    /*
    В переменной n хранится вещественное число с ненулевой дробной частью.
    Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
     */
    public static void main(String[] args) {
        float n = -1.556788F;

        float rounded = round(n);

        System.out.println(rounded);
    }

    public static float round(float n) {
        int c=(int)n;
        float x=n-c;
        if(x<0.5&&x>-0.5) {
            return c;
        }
        else {
            if(c>0){
            return c+1;
        }
            else {
            return c-1;
            }
        }
    }
}
