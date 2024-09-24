public class Aspirant extends Student {

    private String dissertationTitle;

    public Aspirant(String firstName,
                    String lastName,
                    String group,
                    double averageMark,
                    String dissertationTitle) {
        super(firstName, lastName, group, averageMark);
        this.dissertationTitle = dissertationTitle;
    }

    @Override
    public int getScholarship() {
        if (averageMark == 5) {
            return 2500;
        }
        return 2200;
    }
}
