package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafe {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread thread0 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        thread0.start();
        thread1.start();

        thread0.join();
        thread1.join();

        System.out.println(counter.getValue());

        // main -  в нем сейчас находимся
        // thread0
        // thread1
    }
}


class Counter {
    private AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        counter.incrementAndGet();
        //counter++;
    }

    public int getValue() {
        return counter.intValue();
    }
}
