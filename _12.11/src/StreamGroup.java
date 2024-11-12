import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class StreamGroup {
    public static void main(String[] arg) {

        List<Student> students = List.of(
                new Student("Max", 19),
                new Student("Alex", 19),
                new Student("Mary", 20),
                new Student("Jan", 21),
                new Student("Krista", 22),
                new Student("Zik", 20)
        );

        Map<Integer, List<Student>> map = students.stream()
                .collect(Collectors.groupingBy(student -> student.getName().length()));

        for (Map.Entry<Integer, List<Student>> item : map.entrySet()) {
            System.out.println("Возраст %d, имеют студенты %s".formatted(item.getKey(), item.getValue()));
        }
    }
}
