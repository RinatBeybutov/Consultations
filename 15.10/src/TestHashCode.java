import java.util.HashMap;
import java.util.Map;

public class TestHashCode {
    public static void main(String[] args) {
        Map<Cat, String> catToString = new HashMap<>();

        Cat c1 = new Cat("Barsik");
        Cat c2 = new Cat("C2");
        Cat c3 = new Cat("C3");
        Cat c4 = new Cat("C4");
        Cat c5 = new Cat("C5");

        catToString.put(c1, c1.getName());
        catToString.put(c2, c2.getName());
        catToString.put(c3, c3.getName());
        catToString.put(c4, c4.getName());

        System.out.println();
    }
}
