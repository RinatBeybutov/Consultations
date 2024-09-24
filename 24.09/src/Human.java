public class Human {

    private String name;

    private boolean sex;

    private boolean isMale;

    private Human father;

    private Human mother;
    // null
    // new Human()

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, Human father, Human mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
    }
}
