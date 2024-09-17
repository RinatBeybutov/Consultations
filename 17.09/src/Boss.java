public class Boss extends Employee {

    public void getBonus() {
        System.out.println("Годовая премия получена!");
    }

    @Override
    public void getName() {
        System.out.println("Я тут босс!");
    }
}
