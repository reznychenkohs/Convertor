package Singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.showMessage("Logging 1");

        Logger logger1 = Logger.getInstance();
        logger1.showMessage("Logging 2");

        if (logger == logger1) {
            System.out.println("Один і той же екземляр класу");
        } else {
            System.out.println("Різні екземпляри класу");
        }
    }
}
