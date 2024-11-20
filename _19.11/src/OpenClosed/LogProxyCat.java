package OpenClosed;

public class LogProxyCat extends Cat {

    private final Cat cat;

    public LogProxyCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void meow() {
        System.out.println("зашел в метод meow");
        cat.meow();
        System.out.println("Вышел из метода meow");
    }
}
