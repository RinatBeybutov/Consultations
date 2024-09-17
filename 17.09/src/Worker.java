public class Worker extends Employee {

    public void work() {
        System.out.println("Я работаю!");
    }


    @Override
    public void getName() {
        System.out.println("Я worker!!!");
    }
}
