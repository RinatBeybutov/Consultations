package InterfaceSegregation;

public class Penguin implements Bird {

    @Override
    public void swim() {
        System.out.println("Swimming");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}
