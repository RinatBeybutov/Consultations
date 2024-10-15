public class Cat {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return 0;
        //return super.hashCode();
    }
}
