public class GeneralNumber <T> {

    private T value;

    public GeneralNumber(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public boolean isIntegerClassInside() {
        return value instanceof Integer;
    }
}
