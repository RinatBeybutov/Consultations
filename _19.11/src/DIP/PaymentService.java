package DIP;

public class PaymentService {

    private ILogger logger;

    public PaymentService(ILogger logger) {
        this.logger = logger;
    }

    public void pay() {
        logger.log("Платеж начался");

        System.out.println("Проверка балансов...");
        System.out.println("Изменение балансов счетов...");
        System.out.println("Произведен платеж");

        logger.log("Платеж закончился");
    }
}
