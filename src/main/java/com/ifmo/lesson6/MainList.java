package com.ifmo.lesson6;

public class MainList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.take();
        Object a = linkedList.get(1);
       // System.out.println(a);
        linkedList.push(55);
        a = linkedList.get(1);
        System.out.println(a);
        linkedList.add(1111);
        a = linkedList.get(5);
        System.out.println(a);
        linkedList.push(0000);
        linkedList.remove(2);
        a = linkedList.get(0);
        System.out.println(a);
        a = linkedList.get(1);
        System.out.println(a);
        a = linkedList.get(2);
        System.out.println(a);
        a = linkedList.get(3);
        System.out.println(a);

        for (Object i:linkedList) {
            System.out.print(i+" ");
        }
    }
}
