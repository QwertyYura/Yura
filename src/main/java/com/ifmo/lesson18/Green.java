package com.ifmo.lesson18;

public class Green implements Trigger {

    @Override
    public void tChange(int i) {
        if (i > 70) {
            System.out.println("Green");
        }
    }
}
