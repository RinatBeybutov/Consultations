import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //System.out.println(getList1());

        List<List<Integer>> input = List.of(List.of(1, 2, 3), List.of(1, 2, 3), List.of(1));
        System.out.println("input = " + input);
        var result = concatLists(input);
        System.out.println("result = " + result);
    }

    /**
     * 1. Задача: Напишите программу с использованием стримов!, которая
     * создает список чисел от 1 до 100, фильтрует их и выводит на
     * экран все числа, которые делятся на 3 без остатка.
     */
    public static List<Integer> getList() {
        return Stream.iterate(1, n -> n + 1)
                .limit(100) // промежуточная операция
                .filter(number -> number % 3 == 0)
                //.peek(n -> System.out.println(n)) // промежуточная операция
                .toList();
    }

    public static List<Integer> getList1() {
        var list = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        list.removeIf(value -> value % 3 != 0);
        return list;
    }

    public static List<Integer> getList2() {
        return IntStream.rangeClosed(1, 100)
                .filter(n -> n % 3 == 0)
                .boxed()
                .toList();
    }


    /**
     * {
     *     {1,2,3},
     *     {1,2,3},
     *     {1}
     * }
     * =>
     * {
     *     1,2,3,1,2,3,1
     * }
     *
     * User -> {Group1, Group2 .. }
     * Список всех групп всех пользователей
     *
     * {1,2,3} -> {1}, {2}, {3}
     */

    public static List<Integer> concatLists(List<List<Integer>> lists) {
        return lists.stream()
                .flatMap(Collection::stream)
                .toList();
    }


    /**
     *
     numbers.add(2);
     numbers.add(2);

     // Ошибка!
     for (Integer number : numbers) {
     numbers.add(3);
     }

    var iterator = numbers.listIterator();

        while (iterator.hasNext()) {
        iterator.next();
        iterator.add(4);
    }
     */
}