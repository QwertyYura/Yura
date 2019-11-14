package com.ifmo.lesson8;

import java.util.Iterator;

/**
 * Односвязный список, где каждый предыдущий
 * элемент харнит ссылку на следующий. Список
 * оканчивается ссылкой со значением {@code null}.
 */
public class LinkedList<T> implements List<T>, Stack<T>, Queue<T> {
    /** Ссылка на первый элемент списка. */
    private Item<T> head;

    /** {@inheritDoc} */
    @Override
    public void add(T val) {
        // TODO implement.
    }

    /** {@inheritDoc} */
    @Override
    public T take() {
        // TODO implement.

        return null;
    }

    /** {@inheritDoc} */
    @Override
    public T get(int i) {
        // TODO implement.

        return null;
    }

    /** {@inheritDoc} */
    @Override
    public T remove(int i) {
        // TODO implement.

        return null;
    }

    /** {@inheritDoc} */
    @Override
    public Iterator<T> iterator() {
        // TODO implement.

        return null;
    }

    /** {@inheritDoc} */
    @Override
    public void push(T value) {
        // TODO implement.
    }

    /** {@inheritDoc} */
    @Override
    public T pop() {
        // TODO implement.

        return null;
    }
}
