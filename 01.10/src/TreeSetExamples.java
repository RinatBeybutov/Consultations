import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExamples {

    public static void main(String[] args) {

        // Лист сожержит все добавляемые элементы
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(2);

        System.out.println();

        // Set содержит только уникальные элементы!
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(2);
        hashSet.add(2);

        // Set содержит только уникальные элементы!
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(2);
        treeSet.add(2);

        // Создание tree set с компаратором по возрасту
        StudentAgeComparator studentAgeComparator = new StudentAgeComparator();
        TreeSet<Student> studentsWithAgeComparator = new TreeSet<>(studentAgeComparator);

        Student s1 = new Student(160, 25, "Alex");
        Student s2 = new Student(150, 20, "Max");
        Student s3 = new Student(140, 26, "John");

        studentsWithAgeComparator.add(s1);
        studentsWithAgeComparator.add(s2);
        studentsWithAgeComparator.add(s3);

        // Создание tree set с компаратором по росту
        StudentHeightComparator studentHeightComparator = new StudentHeightComparator();
        TreeSet<Student> studentsWithHeightComparator = new TreeSet<>(studentHeightComparator);

        studentsWithHeightComparator.add(s1);
        studentsWithHeightComparator.add(s2);
        studentsWithHeightComparator.add(s3);

        // Использование static метода интерфейса Comparator
        TreeSet<Student> studentsWithStaticComparator = new TreeSet<>(Comparator.comparing(Student::getAge));

        studentsWithStaticComparator.add(s1);
        studentsWithStaticComparator.add(s2);
        studentsWithStaticComparator.add(s3);

        // Использование comparable

        TreeSet<Cat> cats = new TreeSet<>();

        Cat c1 = new Cat(8, 12, "Barsik");
        Cat c2 = new Cat(9, 12, "Mursik");
        Cat c3 = new Cat(5, 12, "Kot");

        cats.add(c1);
        cats.add(c2);
        cats.add(c3);

        System.out.println();

    }
}
