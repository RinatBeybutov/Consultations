package org.example;

public class Main {
    public static void main(String[] args) {

        String name = Thread.currentThread().getName();
        System.out.println("Имя потока - " + name);

        // 1й вариант запуска действия в отдельном потоке
        CustomExtendedThread customExtendedThread = new CustomExtendedThread();
        customExtendedThread.start(); // Запуск потока в этой строке!

        // 2й вариант запуска действия в отдельном потоке
        CustomThreadImplementsRunnable implementedThread = new CustomThreadImplementsRunnable();

        Thread thread2 = new Thread(implementedThread);
        thread2.start();

        System.out.println("Я в главном потоке!");

    }
}