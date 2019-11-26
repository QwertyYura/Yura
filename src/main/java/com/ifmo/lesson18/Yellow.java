package com.ifmo.lesson18;

public class Yellow implements Trigger {
    @Override
    public void tChange(int i) {
        if (i > 110) {
            System.out.println("Yellow");
        }
    }
}
