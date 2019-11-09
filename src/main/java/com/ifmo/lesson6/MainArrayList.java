package com.ifmo.lesson6;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("f");
        arrayList.add("g");
        arrayList.add("h");
        arrayList.add("i");
        arrayList.add("k");
        arrayList.add("l");
        arrayList.remove(1);
        arrayList.remove(1);
        arrayList.remove(1);
        arrayList.remove(1);
        arrayList.add("88");
        arrayList.add("800");
        arrayList.remove(7);
        Object b = arrayList.get(5);
        System.out.println(b);


        for (Object a:arrayList) {
            System.out.println(a);
        }
    }
}
