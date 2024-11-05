package org.example;

public class ProxyBenchmarkCat extends Cat {

    private final Cat cat;

    public ProxyBenchmarkCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void meow() {
        long start = System.nanoTime();
        cat.meow();
        long duration = System.nanoTime() - start;

        System.out.println("duration = " + duration);
    }
}
