package org.example;

public class Mouse {

    private int age = 5;

    public int getAge() {
        System.out.println("Получаю возраст мыши");
        return age;
    }

    public void decreaseAge() {
        age--;
    }
}
