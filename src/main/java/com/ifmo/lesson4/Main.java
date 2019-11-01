package com.ifmo.lesson4;

public class Main {

    public static void main(String[] args) {
        Library Library = new Library(2);

        boolean a =Library.put(new Book("Leo Tolstoy", "War and Peace"), 6);
        System.out.println(a);
        a=Library.put(new Book("Alexandre Pushkin", "Eugene Onegin"), 2);
        System.out.println(a);
        a =Library.put(new Book("Victor Hugo", "Notre Dame"), 9);
        System.out.println(a);

       int b =Library.take(new Book("Leo Tolstoy", "War and Peace"), 2);
       System.out.println(b);
       a =Library.put(new Book("Victor Hugo", "Notre Dame"), 9);
       System.out.println(a);
       b =Library.take(new Book("Leo Tolstoy", "War and Peace"), 6);
       System.out.println(b);
        a =Library.put(new Book("Victor Hugo", "Notre Dame"), 9);
        System.out.println(a);
    }
}
