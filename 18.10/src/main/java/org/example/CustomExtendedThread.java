package org.example;

public class CustomExtendedThread extends Thread {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread - " + i);
        }
    }
}
