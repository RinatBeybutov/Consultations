package OpenClosed;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        //cat.meow();

        Cat proxyCat = new LogProxyCat(cat);

        var array = new Cat[]{cat, proxyCat};

        for (Cat c : array) {
            c.meow();
        }
    }
}
