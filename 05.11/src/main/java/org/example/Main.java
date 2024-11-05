package org.example;

public class Main {

    public static void main(String[] args) {

        // Shift + shift - поиск по имени файла
        // Ctrl + shift + f - поиск внутри файлов
        // Ctrl + E - последние редактируемые файлы
        // Ctrl + Shift + E - последние места редактирования кода

        // Список закинуть в справочную информацию

        //List<Integer> items = List.of(1,2,3);

        Cat cat = new Cat();

        Cat catProxy = new ProxyBenchmarkCat(cat);

        //catProxy.meow();

        Cat logCat = new LogProxyCat(cat);

        logCat.meow();

        System.out.println("----------------");

        Dog dog = new DogImpl();

        Dog dogProxy = new DogProxy(dog);

        System.out.println(dogProxy.giveHand());

        dog.setHand(true);

        System.out.println(dogProxy.giveHand());

        // Cglib и JdkProxy

        System.out.println("----------------");
        // Пример работы кэша

        Mouse mouse = new Mouse();

        Mouse proxyMouse = new CacheProxyMouse(mouse);

        proxyMouse.getAge(); // из реального объекта
        proxyMouse.getAge(); // из кэша

        proxyMouse.decreaseAge();

        proxyMouse.getAge();




    }
}
