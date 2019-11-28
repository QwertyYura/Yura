package com.ifmo.lesson19;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ReflectionUtils reflectionUtils = new ReflectionUtils();
        System.out.println(reflectionUtils.toString(new A(1,"ss")));
    }
}
