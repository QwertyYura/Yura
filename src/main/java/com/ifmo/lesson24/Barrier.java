package com.ifmo.lesson24;

public class Barrier extends Thread {

    private int countThread;

    public Barrier(int countThread) {

        this.countThread = countThread;

    }
    int i=1;

    public synchronized void await() throws InterruptedException{

        while (i<=countThread){
                sleep(1000*i);
                System.out.println("Пришел поток №"+i);
                i++;
                wait();
            }
        notifyAll();
    }
}
