package com.ifmo.lesson6;

import java.util.Iterator;

/**
 * Односвязный список, где каждый предыдущий
 * элемент харнит ссылку на следующий. Список
 * оканчивается ссылкой со значением {@code null}
 */
public class LinkedList implements List, Stack, Queue {
    /** Ссылка на первый элемент списка. */
    private Item head;

    /** {@inheritDoc} */
    @Override
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

    /** {@inheritDoc} */
    @Override
    public Object take() {

        if (head==null){
            return null;
        }
        if(head.next==null){
            Object temp = head.value;
            head = null;
            return temp;
        }
        head = head.next;
        return head.value;
    }

    /** {@inheritDoc} */
    @Override
    public Object get(int i) {
        if(head==null||i<0){
            return null;
        }

        Item newItem = head;
        for (int j = 0; j < i ; j++) {
            newItem = newItem.next;
            if(newItem == null){
                return null;
            }
        }

        return newItem.value;
    }

    /** {@inheritDoc} */
    @Override
    public Object remove(int i) {
        if(head==null||i<0){
            return null;
        }

        Item deleteItem = head;
        Item previous = head;
        Item following = head;

        if(i==0) {
            head = deleteItem.next;
            return deleteItem.value;
        }

        for (int j = 0; j < i; j++) {

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

    /** {@inheritDoc} */
    @Override
    public Iterator iterator() {

        return new LinkedListIterator() {
            Item iterator = head;
            Object itervalue=null;

            @Override
            public boolean hasNext() {

                return iterator!=null;
            }

            @Override
            public Object next() {
                itervalue = iterator.value;
                iterator = iterator.next;
                return itervalue;
                }
        };
    }

    /** {@inheritDoc} */
    @Override
    public void push(Object value) {
        Item pushItem = head;
        head = new Item(value);
        head.next = pushItem;
    }

    /** {@inheritDoc} */
    @Override
    public Object pop() {

        if (head==null) {
            return null;
        }

        head=head.next;
        return head.value;
    }
}
