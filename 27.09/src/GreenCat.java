public final class GreenCat extends Cat {

    static {
        System.out.println("Static green cat");
    }

    private String name;
    private int age;
    private double d;
    private float f;
    private char c;
    private boolean isScientific;
    private String owner;

    public static GreenCat getScientificCat(String name, int age, String owner) {
        return new GreenCat(name, age, true, owner);
    }

    private GreenCat(String name, int age, boolean isScientific, String owner) {

    }

    private GreenCat() {
        System.out.println("green Cat");
    }

    public static class Builder {

        private String name;
        private int age;
        private boolean isScientific;
        private String owner;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public GreenCat build() {
            return new GreenCat(name, age, isScientific, owner);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public boolean isScientific() {
        return isScientific;
    }

    public void setScientific(boolean scientific) {
        isScientific = scientific;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
