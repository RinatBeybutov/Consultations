package org.example;

import java.util.List;
import java.util.stream.Stream;

public class TaskFixArray {

    /**
     * 1. Буквы бесплатные w -> word
     * 2. Программирование на уровне интерфейсов ArrayList -> List
     * 3. .collect(Collectors.toList()); -> .toList()
     * 4. Поправить фильтр
     */
    public static List<String> fix(List<String> words){
        return words.stream()
                .filter(word -> !word.contains("р") || word.contains("л"))
                .flatMap(word -> {
                    if(word.contains("л") && !word.contains("р")) {
                        return Stream.of(word + word);
                    }
                    return Stream.of(word);
                })
                .toList();
    }
}
