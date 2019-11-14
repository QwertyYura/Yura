package com.ifmo.lesson8.Appendable;

public interface Appendable<T> {
    Appendable append(T type);
    T value();
}
