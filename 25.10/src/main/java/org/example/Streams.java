package org.example;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        iterateFor();
        iterateStream();
    }

    private static void iterateStream() {
        AtomicInteger index = new AtomicInteger();
        Stream.of(1,2,3)
                .forEach(item -> {
                    index.getAndIncrement();
                });

    }

    private static void iterateFor() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }
}
