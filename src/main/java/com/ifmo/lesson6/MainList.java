package com.ifmo.lesson6;

import java.util.Iterator;

public class MainList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Magic");
       linkedList.add("2");
      //  linkedList.add("Magic");


       // Object b = linkedList.take();
       Object b = linkedList.get(1);

        System.out.println(b);
    }
}
