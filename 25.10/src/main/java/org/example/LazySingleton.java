package org.example;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if(instance == null) {
            System.out.println("Я создал lazy!");
            instance = new LazySingleton();
        }
        return instance;
    }
}
