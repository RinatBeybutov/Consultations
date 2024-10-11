import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Labdas {
    public static void main(String[] args) {

        // Через создание отдельного класса имплементирующего интерфейс Сomparator
        TreeSet<Human> set = new TreeSet<>(new HumanComparator());
        set.add(new Human("Alex", 62));
        set.add(new Human("ZMax", 20));
        set.add(new Human("John", 20));
        set.add(new Human("Alberto", 20));
        System.out.println();

        TreeSet<Human> setLambdas = new TreeSet<>(getComparator());


        /**
         * boolean test(T t) - Predicate
         */

        Predicate<Human> isOldCitizen = human -> {
            return human.getAge() > 60;
        };

        Human Alex = set.pollLast();

        boolean isAlexOldes = isOldCitizen.test(Alex);

        System.out.println(isAlexOldes);
    }

    // Через лямбду создание метода функционального интерфейса Comparator
    public static Comparator<Human> getComparator() {
        return (o1, o2) -> {
            if(o1.getAge() != o2.getAge()) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            return o1.getName().compareTo(o2.getName());
        };
    }
}
