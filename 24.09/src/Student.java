public class Student {

    private String firstName;
    private String lastName;
    private String group;

    protected double averageMark;

    public Student(String firstName,
                   String lastName,
                   String group,
                   double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        if (averageMark == 5) {
            return 2000;
        }
        return 1900;
    }

    // Overload
    public int getScholarship(int bonus) {
        if (averageMark == 5) {
            return 2000 + bonus;
        }
        return 1900 + bonus;
    }

    // Overload
    public int getScholarship(int ... bonuses) {
        int sum = 0;
        for (int bonus : bonuses) {
            sum+= bonus;
        }

        if (averageMark == 5) {
            return 2000 + sum;
        }
        return 1900 + sum;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
}
