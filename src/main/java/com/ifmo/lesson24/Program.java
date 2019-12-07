package com.ifmo.lesson24;

public class Program {
    public static void main(String[] args) throws InterruptedException {

        int c = 3;

        Barrier b = new Barrier(c);

        for (int i = 0; i < c; i++) {
            new Thread(){
                @Override
                public void run() {
                    System.out.println("Before barrier");
                    try {
                        b.await();
                        System.out.println("After barrier");

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
        
    }
}
