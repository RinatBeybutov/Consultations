import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //sort(List.of("b", "a", "c", "aa", "ab", "aaaa")).forEach(System.out::println);

        //System.out.println("anyMatch() = " + anyMatch());

    }

    public static void testNPE() {
        Optional<String> name = getOptionalName();
        if (name.isPresent()) {
            String result = name.get();
        } else {
            System.out.println("Пустой объект!");
        }

        //String result = name.orElseThrow(() -> new RuntimeException("User not found"));
        System.out.println(name.orElse("Пустое имя!"));
    }

    // Внутри класса Person
    public static String getName() {
        String name = null;
        // NPE
        name.length();
        return name;
    }

    public static Optional<String> getOptionalName() {
        String name = "Василий";
        return Optional.ofNullable(name);
    }

    public static void createStream() {
        // Метода создания Stream
        // Через коллекцию

        List<String> list = Arrays.asList("one", "two", "three");
        Stream<String> stream = list.stream();

        // Stream.of

        Stream<String> stream2 =
                Stream.of("one", "two", "three");

        // Через массив
        String[] strings = {"one", "two", "three"};
        Stream<String> stream3 = Arrays.stream(strings);

        // Stream.iterate

        Stream<Integer> stream4 = Stream.iterate(1, n -> n + 1);

        // Stream.generate

        Stream<Double> stream5 = Stream.generate(Math::random);

        // Stream.concat

        Stream<String> stream7 = Stream.concat(stream, stream2);

        // Stream.builder

        Stream.builder().add("one").add("two").build();

        //Stream<Cat> catStream = Stream.of(new Cat(), new Cat());
    }

    /**
     * Задача 1:
     * Найти сумму всех элементов массива
     */
    public static int sum(int[] arr) {
        /**
         * Шаг 1: Создать Stream
         * Шаг 2: Вычислить сумму
         */
        //IntStream stream = Arrays.stream(arr);
        return Arrays.stream(arr)
                .sum();
    }

    /**
     * Задача 2:
     * Вывести в консоль все четные числа,
     * каждое число с новой строки
     */
    public static void printEven(List<Integer> numbers) {
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

    /**
     * Задача 3:
     * Отсортировать список строк по длине
     */
    public static List<String> sort(List<String> strings) {
        return strings.stream()
                .sorted(Comparator.comparing(String::length))
                .toList();
    }

    /**
     * Что выведется в консоль ?
     */
    public static boolean anyMatch() {
        String test = "ABCD";
        boolean bool = "ABCD".startsWith("B");

        return Stream.of("d2", "a1", "b1", "b3", "c")
                // d2 -> D2, a1 -> A1, b1 -> B1
                .map(string -> {
                    System.out.println("map " + string);
                    return string.toUpperCase();
                })
                .anyMatch(string -> {
                    System.out.println("Match " + string);
                    return string.startsWith("A");
                });
    }

    /**
     * Что выведется в консоль ?
     */
    public static Optional<Integer> findFirst() {
        return Stream.of(null, null, 3, 5)
                .peek(System.out::println)
                .filter(Objects::nonNull)
                .filter(a -> a % 2 == 0)
                .peek(System.out::println)
                .findFirst();
    }
}