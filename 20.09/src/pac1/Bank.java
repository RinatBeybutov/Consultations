package pac1;

public class Bank {

    public static String ORGANIZATION_TYPE = "BANK";

    //private
    private int cash = 100;

    //public
    public int countUsers = 100;

    // Package - private = default
    String bankName = "M-bank";

    protected boolean hasCertification = true;

    public void printCash() {
        System.out.println("Cash - " + cash);
    }

    public int getCash() {
        return cash;
    }


}
