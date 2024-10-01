import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExamples {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();


        // Map - Набор Ключ - Значение

        hashSet.add(2);
        hashSet.add(2);

        hashSet.add(4);
        hashSet.add(3);

        var iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(2);
        linkedHashSet.add(2);
        linkedHashSet.add(4);
        linkedHashSet.add(3);

        var iteratorLinkedSet = linkedHashSet.iterator();

        System.out.println("----");
        while (iteratorLinkedSet.hasNext()) {
            System.out.println(iteratorLinkedSet.next());
        }

        System.out.println();

    }
}
