package org.example;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();

        Singleton instance1 = Singleton.getInstance();

        System.out.println("Равенство хэшкодов - " + (instance.hashCode() == instance1.hashCode()));

        LazySingleton lazy = LazySingleton.getInstance();

        LazySingleton lazy1 = LazySingleton.getInstance();

        System.out.println();

        /**
         * Синглтон - антипаттерн, потому что
         * 1. Потоконебезопастный
         * 2. Нарушение принципа единой ответственности
         */


    }
}