public class Main {
    public static void main(String[] args) {

        // Осмысленные названия переменных

        /**
         * Задача 3. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
         * насколько быстрее голодный Вася съедает один банан? Вывести на косоль
         */
        int a = 9;

        int timeHungryVasya = 9;
        int count = 3;

        int speedHungry = count / timeHungryVasya;

        int b = a * 2;

        // Форматирование кода
        // Ctrl + alt + l

        if (b == 2) {

        }

        // Правила написания переменных
        speedHungry = 2;  //- lowerCamelCase

        // AccountClass

        // Написание констант

        final int LENGTH_ALPHABET = 33;

        // String.format()

        //name = String.format("%s (%s)", machineryModelEntity.getName(),  machineryModelEntity.getModification());

        //"" + machineryModelEntity.getName() + "(" + machineryModelEntity.getModification() + ")"

        System.out.println(String.format("Мое имя %s", "Алекс"));

        // Постепенно еформатирование кода

        //Math.random() - 0..1

        int randomInt = (int) (Math.random() * 100);


        // Текст ошибки в консоли

        a = 10;
        b = 0;
        int c = 5;

        //System.out.println(a/b);

        // Тернарный оператор
        //(условие ) ? (если true ) : (если false)

        System.out.println(a > b ?
                a < c ? a :
                        b > c ? b : c :
                b < c ? b : a < c ? c : a);

        boolean isAGreatherThanB = a > b;

        c = isAGreatherThanB ? a : b;


        // Побитовый операторы

        /**
         * &
         * >>
         * <<
         * ..
         */

        // Таблица умножения
        /**
         * Вывести на экран таблицу умножения 10х10 используя цикл while.
         * Числа разделить пробелом.
         *
         * Пример вывода на экран:
         * 1 2 3 4 5 6 7 8 9 10
         * 2 4 6 8 10 12 14 16 18 20
         * 3 6 9 12 15 18 21 24 27 30
         * 4 8 12 16 20 24 28 32 36 40
         * 5 10 15 20 25 30 35 40 45 50
         * 6 12 18 24 30 36 42 48 54 60
         * 7 14 21 28 35 42 49 56 63 70
         * 8 16 24 32 40 48 56 64 72 80
         * 9 18 27 36 45 54 63 72 81 90
         * 10 20 30 40 50 60 70 80 90 100
         */

        int i = 1;

        while ( i <= 10) {
            int j = 1;
            while (j <=10) {
                System.out.print(i*j++ + " ");
            }
            i++;
            System.out.println("Перенос строки");
        }
    }
}