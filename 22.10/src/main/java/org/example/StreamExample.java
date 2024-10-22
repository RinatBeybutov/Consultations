package org.example;

import java.io.NotActiveException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        //Set<Integer> set2 = getSet2();

        Set<Integer> set1 = getSet1();

        System.out.println();

        Cat c1 = new Cat("Barsik");//9
        Cat c2 = new Cat("Bobik");

        Cat c3 = new Cat("Mursik");
        c3.decreaseLives();

        Map<Integer, List<Cat>> livesToCat = Stream.of(c1, c2, c3)
                .collect(Collectors.groupingBy(Cat::getLivesCount));

        List<Cat> catsWith9Lives = livesToCat.get(9);


        System.out.println();

    }

    public static Set<Integer> getSet1() {
        return Stream.iterate(0, n-> n+1)
                .limit(5)
                .collect(Collectors.toSet());
    }

    public static Set<Integer> getSet2(){
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            result.add(i);
        }
        return result;
    }

    public static void getGetError() throws NotActiveException {
        throw new NotActiveException();
    }
}
