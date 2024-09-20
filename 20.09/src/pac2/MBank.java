package pac2;

import pac1.Bank;

public class MBank extends Bank {

    public void print() {
        // Приватная только через геттер
        int cash = this.getCash();

        // Публичная переменная
        int countUsers1 = this.countUsers;

        // Protected
        boolean hasCertification1 = this.hasCertification;
    }


}
