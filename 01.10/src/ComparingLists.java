import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ComparingLists {
    public static void main(String[] args) {

        // Tree Set + comparator

        /**
         * Сравнение linked list и array list
         */

        LinkedList<Integer> linkedList = new LinkedList<>();

        ArrayList<Integer> arrayList = new ArrayList<>();

        int size = 1_00_000;

        long start = System.nanoTime();

        test(arrayList, size);

        long duration = System.nanoTime() - start;

        System.out.println("Duration (arraylist_) - " + duration + " ns");

        start = System.nanoTime();

        test(linkedList, size);

        duration = System.nanoTime() - start;

        System.out.println("Duration (linkedlist ) - " + duration + " ns");

    }

    public static void test(List<Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(0, i);
        }
    }
}