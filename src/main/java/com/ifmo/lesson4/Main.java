package com.ifmo.lesson4;

public class Main {

    public static void main(String[] args) {
        Library library = new Library(6);
        boolean a = library.put(new Book(new String("dd"), "77"), 2);
        int d = library.take(new Book("dd","77"), 3);

        System.out.println(d);
    }
}
