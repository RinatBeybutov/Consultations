package DIP;

public class Main {
    public static void main(String[] arg) {

        PaymentService service = new PaymentService(new LoggerFileImpl());

        service.pay();

    }
}
