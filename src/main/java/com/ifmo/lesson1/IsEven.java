package com.ifmo.lesson1;

    public class IsEven {
        /* Напишите программу, которая выводит true, если число четное и false, если нет. */
        public static void main(String[] args) {
            int a=1222221;
            boul(a);
            System.out.print(boul(a));
        }
        public static boolean boul(int a){
            int r=a%2;
            if(r==0){
                return true;
            }
            else{
                return false;
            }
        }
    }
