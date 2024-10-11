import java.util.Comparator;

public class HumanComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        if(o1.getAge() != o2.getAge()) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return o1.getName().compareTo(o2.getName());
    }
}
