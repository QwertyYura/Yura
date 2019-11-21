package com.ifmo.lesson4;

import javax.swing.*;

/**
 * Библиотека помогает вести учет книг: какие книги и сколько в ней хранятся.
 * Библиотека ограничена по числу типов книг, это ограничение задается аргументом
 * конструктора maxBookKinds. Например, если библиотека ограничена числом 10,
 * то это означает, что она может хранить 10 разных книг, но любое их количество.
 *
 * Если из библиотеки убираются все книги одного типа, то освобождается место,
 * на которое можно добавить книгу другого типа.
 * Например:
 * <pre>
 *     Library library = new Library(2);
 *     library.put(new Book("Stephen King", "Shining"), 2); // return true
 *     library.put(new Book("Stephen King", "Dark Tower"), 3); // return true
 *
 *     // Эту книгу добавить не можем, т.к. лимит 2
 *     library.put(new Book("Tolstoy", "War and peace"), 6); // return false
 *
 *     // Забираем все книги Тёмной башни, чтобы освободить место.
 *     library.take(new Book("Stephen King", "Dark Tower"), 3) // return 3
 *
 *     // Теперь мы можем успешно добавить "Войну и мир".
 *     library.put(new Book("Tolstoy", "War and peace"), 6); // return true
 * </pre>
 *
 * Если попытаться взять из библиотеки больше книг, чем у нее есть, то она
 * должна вернуть только число книг, которые в ней находились и освободить место.
 * Например:
 *
 * <pre>
 *     Library library = new Library(2);
 *     library.put(new Book("Stephen King", "Shining"), 2); // return true
 *
 *     // Все равно вернет 2, т.к. больше нет.
 *     library.take(new Book("Stephen King", "Shining"), 10) // return 2
 * </pre>
 */
public class Library {
    Department[] departments;

    public Library(int maxBookKinds) {
        departments = new Department[maxBookKinds];
    }

    /**
     * Add books to library.
     *
     * @param book     Book to add.
     * @param quantity How many books to add.
     * @return {@code True} if book successfully added, {@code false} otherwise.
     */
    public boolean put(Book book, int quantity) {
        for (int i = 0; i < departments.length; i++){
            if (departments[i]==null) {
                Department department = new Department(book, quantity);
                departments[i] = department;
                return true;
            }
            }
        return false;
    }

    /**
     * Take books from library.
     *
     * @param book     Book to take.
     * @param quantity How many books to take.
     * @return Actual number of books taken.
     */
    public int take(Book book, int quantity) {
        int temp = 0;
        for (int i = 0; i < departments.length; i++) {
            if (departments[i]==null){
                continue;
            }
            if(departments[i].book.author==book.author&&departments[i].book.title==book.title){
                temp = departments[i].quantity;
                if(quantity>=departments[i].quantity){
                    departments[i]=null;
                }
                else {
                    temp = quantity;
                    departments[i].quantity = departments[i].quantity - quantity;
                }
            }
        }
        return temp;
    }
}
