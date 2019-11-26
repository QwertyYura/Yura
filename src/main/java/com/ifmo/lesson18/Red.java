package com.ifmo.lesson18;

public class Red implements Trigger {

    @Override
    public void tChange(int t) {
        if(t>130){
            System.out.println("Red");
        }
    }
}
