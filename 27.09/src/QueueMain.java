import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class QueueMain {

    public static void main(String[] args) {
        CustomQueue customQueue = new CustomQueue();

        customQueue.push(1);
        customQueue.push(2);
        customQueue.push(3);
        customQueue.push(4);

        int first = customQueue.pop();

        customQueue.pop();
        customQueue.pop();
        customQueue.pop();


        System.out.println(first);
        System.out.println("Is empty - " + customQueue.isEmpty());

        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(2);
        queue.add(3);
        queue.add(4);

        // Alt + enter
        queue.remove();
        Integer remove = queue.remove();

        System.out.println();


    }
}
