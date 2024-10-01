
public class Cat implements Comparable<Cat> {

    private int weight;
    private int age;
    private String name;

    // Constructor

    public Cat(int weight, int age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    // Methods

    @Override
    public int compareTo(Cat o) {
        return this.weight - o.getWeight();
    }

    // Getters and Setters

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
