package com.ifmo.lesson4;

public class Main {

    public static void main(String[] args) {
        Library library = new Library(1);
        boolean a = library.put(new Book("dd", "77"), 1);
        int d = library.take(new Book("dd","77"), 1);

        System.out.println(d);
    }
}
