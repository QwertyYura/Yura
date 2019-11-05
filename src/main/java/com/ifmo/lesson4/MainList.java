package com.ifmo.lesson4;

public class MainList {
    public static void main(String[] args) {
        LinkedList newlist = new LinkedList();
        newlist.add(5);
        newlist.add(3);

        Object c = newlist.get(2);
        System.out.println(c);

        newlist.add("val");

        c = newlist.get(1);
        System.out.println(c);

        c = newlist.remove(2);
        System.out.println(c);

        c = newlist.get(3);
        System.out.println(c);

        newlist.add(78);
        newlist.add("val4");
        newlist.add("val5");

        c = newlist.get(5);
        System.out.println(c);
    }
}
