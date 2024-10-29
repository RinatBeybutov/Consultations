package org.example;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Mapper mapper = new Mapper();

        List<Cat> cats = List.of(
                new Cat("barsik", new Owner("Alex"), 10),
                new Cat("mursik", new Owner("Max"), 6)
        );

        List<CatDto> catDtos = cats
                .stream()
                .map(mapper::map)
                .toList();

        List<String> allAliases = cats
                .stream()
                .flatMap(cat -> cat.getAliases().stream())
                .toList();

        System.out.println();
    }

}
