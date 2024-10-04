import cats.Cat;

public class ObjectMethods {
    public static void main(String[] args) {

        /**
         * методы класса object
         *
         */

        int [] arr = new int[1];
        arr.hashCode();

        Object o = new Object();
        o.getClass();

        Cat cat1 = new Cat("barsik");

        System.out.println("hashcode - " + cat1.hashCode());
        System.out.println("hashcode - " + o.hashCode());

        /**
         *  Оператор == сравнивает значения для примитивов
         *  а для ссылочных типов данных сравнивает ссылки
         */

        Cat cat2 = new Cat("barsik");

        System.out.println(cat1.equals(cat2));

        System.out.println(cat2);

        System.out.println("before clonning cat2 name - " +cat2.getName());

        Cat cat3 = cat2.clone();
        cat3.setName("mursik");

        // Здесь глубокое копирование
        System.out.println("after changing cat2 name - " + cat2.getName());

        // Десериализация - сериализация



    }
}