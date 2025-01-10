package org.example;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Predicate<Integer> isEven = x -> x % 2 == 0;
        int i = 1;

        isEven(i);

        final ArrayList<Integer> list = new ArrayList<>();
        //list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);




    }

    public static boolean isEven(int x){
        x++;
        return x % 2 == 0;
    }

    public static boolean isOdd(Integer x){

        return x % 2 != 0;
    }
    /**
     * SOLID
     * s 1. Single Responsibility Principle
     * o 2. Open Closed Principle
     * l 3. Liskov Substitution Principle
     * i 4. Interface Segregation Principle
     * 5. Dependency Inversion Principle
     */
}