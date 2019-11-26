package com.ifmo.lesson6;

import java.util.Iterator;

/**
 * Этот класс должен реализовывать следующие методы: add(), get(), remove() и iterator() из интерфейса List.
 * Если при выполнении add() в массиве нет свободных элементов, то создать новый - вдвое больше,
 * скопировать в него все значения из старого и + 1, который сейчас добавляется.
 * Удаление должно сдвинуть все элементы влево, если это требуется.
 * Например, если список с такими элементами:
 * |0|1|2|3|4|5|
 * Удаляем элемент по индексу 2:
 * |0|1|_|3|4|5|
 * Перемещаем все элементы влево:
 * |0|1|3|4|5|_|
 * Теперь при итерации по ним после 1 будет идти сразу 3, как в связном списке.
 */
public class ArrayList implements List {
    private static final int DEFAULT_SIZE = 10;

    private Object[] values;
    private int size;
    /**
     * Создаёт новый {@link #ArrayList} с размером внутреннего массива по умолчанию.
     */
    public ArrayList() {
        this(DEFAULT_SIZE);
    }

    /**
     * Создаёт новый {@link #ArrayList} с размером внутреннего массива,
     * равного {@code initialSize}.
     *
     * @param initialSize Начальный размер внутреннего массива.
     */
    public ArrayList(int initialSize) {
        values = new Object[initialSize];
    }

    /** {@inheritDoc} */
    @Override
    public void add(Object val) {
        if(size<values.length) {
            values[size] = val;
            size++;
            return;
        }

        Object[] newValues = new Object[values.length*2];
            int c=0;
            for (int j = 0; j < values.length; j++) {
                newValues[j]=values[j];
                c++;
            }
            newValues[c]=val;

            values = newValues;
            size++;
    }

    /** {@inheritDoc} */
    @Override
    public Object get(int i) {
        if(i>=values.length){
            return null;
        }
        return values[i];
    }

    /** {@inheritDoc} */
    @Override
    public Object remove(int i) {
        if(i>=values.length){
            return null;
        }
        Object temp = values[i];

        int c =i;

        for (int j = i; j < values.length; j++) {
            if(values[c]==null){
                break;
            }
            if(c==values.length-1){
                values[c]=null;
                size--;
                return temp;
            }
            c++;
            values[j]=values[c];
        }
        values[c]=null;
        size--;
        return temp;
    }

    /** {@inheritDoc} */
    @Override
    public Iterator iterator() {
        return new ArrayListIterator() {
            int i=0;
            @Override
            public boolean hasNext() {
                if(i==values.length){
                    return false;
                }
                return values[i] != null;
            }

            @Override
            public Object next() {
                return values[i++];
            }
        };
    }
}
