package InterfaceSegregation;

public class Duck implements Bird, FlyableBird {

    @Override
    public void swim() {
        System.out.println("Duck I can swim");
    }

    @Override
    public void eat() {

        System.out.println("Duck I can eat");
    }

    @Override
    public void sleep() {
        System.out.println("Duck I can sleep");
    }

    @Override
    public void fly() {
        System.out.println("Duck I can fly");
    }
}
