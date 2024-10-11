import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(-2);

       /*for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }*/

        List<String> res = list.stream()
                .map(String::valueOf)
                .toList();

        System.out.println("После потока!");
    }
}
