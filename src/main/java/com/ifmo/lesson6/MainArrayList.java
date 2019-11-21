package com.ifmo.lesson6;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("a");

        Object a = arrayList.get(0);
        System.out.println(a);

        arrayList.remove(0);

        for (Object b:arrayList) {
         System.out.println(b);
        }
    }
}
