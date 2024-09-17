import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * ....**....
         * ...****...
         * ..******..
         * .********.
         * **********
         *
         * Дана елочка из звездочек, в консоль вводится целое число раз,
         * сколько нужно вывести  елочек в консоль. Елочки разделены одной точкой
         *
         * Для числа 2:
         *
         * ....**.........**....
         * ...****.......****...
         * ..******.....******..
         * .********...********.
         * **********.**********
         */

        Scanner scanner = new Scanner(System.in);
        //int count = scanner.nextInt();

        //printElk(count);


        /**
         * Задание 1:
         *
         * Написать класс Employee - общий, имеет методы getSalary(), getName()
         * Написать класс - наследник Worker, который имеет метод work()
         * Написать класс - наследник Boss, который имеет метод getBonus()
         *
         * Создать массив, состоящий из всех трех типов, вызвать у всех них метод getName()
         */

        Employee [] array = new Employee[3];
        // Создание объекта
        /**
         * Employee         Max                 = new Employee();
         * тип_объекта      имя переменной      = создание конкретного экземпляра
         */

        Employee Max = new Employee();
        Worker Alex = new Worker();
        Boss Sheff = new Boss();

        array[0] = Max;
        array[1] = Alex;
        array[2] = Sheff;

        for (Employee temp : array) {
            temp.getName();
            temp.getSalary();
            // ПРоверка, что наш элемет имеет тип Worker, если имеет
            // То мы приводим Employee temp -> Worker temp
            if(temp instanceof Worker worker) {
                worker.work();
            }
            if(temp instanceof Boss boss) {
                boss.getBonus();
            }
        }

    }

    private static void printElk(int count) {
        String [] lines = new String[]{
          "....**....",
          "...****...",
          "..******..",
          ".********.",
          "**********"
        };
        // Цикл, который выводит 5 строк
        for (int i = 0; i < lines.length; i++) {
            //lines[i] + "." + lines[i] + "."...
            StringBuilder result = new StringBuilder();
            // Внутренний цикл для того, чтобы элемент массива вывести столько раз, сколько нужно
            for (int j = 0; j < count; j++) {
                result.append(lines[i]).append(".");
            }
            result = new StringBuilder(result.substring(0, result.length() - 1));
            System.out.println(result);
        }

    }
}