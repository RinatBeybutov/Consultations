package org.example;

public class CustomThreadImplementsRunnable implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        for (int i = 0; i < 100; i++) {
            System.out.println("runnable - " + i);
        }
    }
}
