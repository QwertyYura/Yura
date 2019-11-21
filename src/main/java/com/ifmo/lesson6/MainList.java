package com.ifmo.lesson6;

import java.util.Iterator;

public class MainList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Magic");

        Object b = linkedList.take();

        System.out.println(b);
    }
}
