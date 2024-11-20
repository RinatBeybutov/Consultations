package InterfaceSegregation;

public class Main {
    public static void main(String[] arg) {

        Penguin penguin = new Penguin();
        Duck duck = new Duck();
        FlyableBird[] birds = new FlyableBird[]{duck, duck};

        fly(birds);
    }

    public static void fly(FlyableBird[] birds) {
        for (FlyableBird bird : birds) {
            bird.fly();
        }
    }
}
