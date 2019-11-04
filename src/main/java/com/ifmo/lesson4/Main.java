package com.ifmo.lesson4;

public class Main {

    public static void main(String[] args) {
        Library library = new Library(2);
        int d = library.take(new Book("ff","7"), 5);
        System.out.println(d);



        boolean a =library.put(new Book("Leo Tolstoy", "War and Peace"), 6);
        System.out.println(a);
        a=library.put(new Book("Alexandre Pushkin", "Eugene Onegin"), 2);
        System.out.println(a);
        a =library.put(new Book("Victor Hugo", "Notre Dame"), 9);
        System.out.println(a);

       int b =library.take(new Book("Leo Tolstoy", "War and Peace"), 2);
       System.out.println(b);
       a =library.put(new Book("bbb", "ssss"), 9);
       System.out.println(a);
       b =library.take(new Book("Leo Tolstoy", "War and Peace"), 6);
       System.out.println(b);
        a =library.put(new Book("bbb", "ssss"), 9);
        System.out.println(a);
    }
}
