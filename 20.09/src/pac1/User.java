package pac1;

public class User {

    private Bank bank = new Bank();

    public void  print() {
        bank.getCash();

        String bankName = bank.bankName;

        boolean hasCertification = bank.hasCertification;

    }

}
