public class VarExamples {

    public static void main(String[] args) {

        var string = new Student(125, 2, "Ace");

        var student = getStudent();

        var accountingBalanceUnitRepository = new AccountingBalanceUnitRepository();

    }

    public static Student getStudent() {
        return new Student(125, 2, "Ace");
    }

    public static class AccountingBalanceUnitRepository {

    }
}
