package com.ifmo.lesson4;

import java.util.Iterator;

/**
 * Односвязный список, где каждый предыдущий
 * элемент харнит ссылку на следующий. Список
 * оканчивается ссылкой со значением {@code null}.
 */
public class LinkedList {
    /** Ссылка на первый элемент списка. */
    private Item head;

    /**
     * Добавляет значение в конец списка.
     *
     * @param val Значение, которое будет добавлено.
     */
    public void add(Object val) {
        if (head==null) {
            head =new Item(val);
            return;
        }
        Item newItem = head;
        while (newItem.next !=null){
            newItem = newItem.next;
        }
        newItem.next = new Item(val);
    }

    /**
     * Извлекает значение из списка по индексу.
     *
     * @param i Индекс значения в списке.
     * @return Значение, которое находится по индексу
     * или {@code null}, если не найдено.
     */
    public Object get(int i) {

        if(head==null||i<=0){
         return null;
        }

        Item newItem = head;
        for (int j = 1; j < i ; j++) {
            newItem = newItem.next;
            if(newItem == null){
                return null;
            }
        }

        return newItem.value;
    }

    /**
     * Удаляет значение по индексу и возвращает
     * удаленный элемент.
     *
     * @param i Индекс, по которому будет удален элемент.
     * @return Удаленное значение или {@code null}, если не найдено.
     */
    public Object remove(int i) {

        if(head==null||i<=0){
            return null;
        }

        Item deleteItem = head;
        Item previous = head;
        Item following = head;

        if(i==1) {
            head = deleteItem.next;
            return deleteItem.value;
        }

        for (int j = 1; j < i; j++) {

            previous = deleteItem;
            deleteItem = deleteItem.next;
            following = deleteItem.next;

            if(deleteItem==null){
                return null;
            }
        }

        previous.next = following;
        return deleteItem.value;
    }
}
