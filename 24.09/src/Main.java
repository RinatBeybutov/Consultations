import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * Связный список
         *
         */

        //testLinkedList();

        //testSwitch(1,0,'/');

        // СОздаем переменную -  выделяем память и передаем ссылку на эту память налево
        /*int [] aa = new int[10];

        int [] bb = null;

        bb = aa;*/

        testCreateMethod();

        ArrayList<Integer> list = new ArrayList<>(20);
        list.add(123);
        list.add(12);

        //Вставка в конец - выгоднее связный список
        /**
         * Вставка в конец:
         * 1. Выделить память на size + 1 элементов
         * 2. Перекопировать текущий массив в новый
         * 3. Вставить новый элемент
         */

        //Получение элемента по индексу - выгоднее массив (ArrayList)


        Human adam = new Human("Adam");

        Human eva = new Human("Eva");

        Human son = new Human("Son", adam, eva);

        System.out.println();



        /**
         * Когда используется приватный конструктор ?
         *
         */

    }

    private static void testCreateMethod() {
        /**
         * Создайте пример наследования, реализуйте класс Student и класс Aspirant,
         * аспирант отличается от студента наличием некой научной работы.
         * Класс Student содержит переменные: String firstName, lastName, group.
         *
         * А также, double averageMark, содержащую среднюю оценку.
         *
         * Создать метод getScholarship() для класса Student, который возвращает сумму
         * стипендии. Если средняя оценка студента равна 5, то сумма 2000 , иначе 1900.
         *
         * Переопределить этот метод в классе Aspirant.  Если средняя оценка аспиранта равна 5,
         * то сумма 2500 , иначе 2200.
         *
         * Создать массив типа Student, содержащий объекты класса Student и Aspirant.
         * Вызвать метод getScholarship() для каждого элемента массива.
         */

        // Ctrl + D
        Student [] students = {
                new Student("Robert", "B", "B12", 3.3),
                new Student("Mark", "C", "A12", 3.4),
                new Aspirant("Sam", "D", "B12", 3.3, "War and piece"),
                new Aspirant("Logan", "R", "A12", 5, "Java programming"),
                new Student("Coul", "E", "B12", 5)
        };

        // Usual for
        /*for (int i = 0; i < students.length; i++) {
            int money = students[i].getScholarship();
            System.out.println("Money - " + money);
        }*/

        // Enhanced for
        for (Student s : students) {
            System.out.println(s.getName());
            System.out.println(" M2 - " + s.getScholarship());
            System.out.println(" With bonus " + s.getScholarship(1000));
            System.out.println("M3 - " + s.getScholarship(100, 200,300));
            System.out.println("----------");
        }
    }

    private static void testLinkedList() {
        LinkedListCustom custom = new LinkedListCustom(2);

        custom.addLast(3);

        custom.addLast(4);

        custom.addFirst(1);

        System.out.println("Last value - " + custom.getLastValue());
        System.out.println("First value - " + custom.getFirstValue());

        int [] array = new int[10];

        int result = array[0]; // Сложность O(1)

    }

    private static int testSwitch(int number1, int number2, char operation) {
        /*if(operation == '/' && number2 == 0) {
            System.out.println("Некорректные данные, делить на 0 нельзя!");
            return 0;
        }*/

        return switch (operation) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '/' -> {
                if (number2 == 0) {
                    System.out.println("ОШибка!");
                    yield 0;
                }
                yield number1 / number2;
            }
            case '*' -> number1 * number2;
            default -> 0;
        };
    }
}