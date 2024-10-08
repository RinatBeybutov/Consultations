public class Subclass extends Super {
    public Subclass() {
        this(1);
        System.out.println("Subclass()");
    }

    public Subclass(int i) {
        // super()
        System.out.println("Subclass(int)");
    }

    public static void main(String[] args) {
        new Subclass();
    }
}
