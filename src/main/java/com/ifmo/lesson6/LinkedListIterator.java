package com.ifmo.lesson6;

import java.util.Iterator;

public abstract class LinkedListIterator implements Iterator {

    @Override
    public abstract boolean hasNext();

    @Override
    public abstract Object next();
}

