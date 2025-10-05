package ChainOfResponsibility;

public class LoggerClient {

    public static void main(String[] args) {

        LoggerHandler loggerChain=new InfoLogger();

        loggerChain.setNext(new DEBUGLogger())
                .setNext(new ErrorLogger());

        loggerChain.handle(LogLevel.INFO, "Application started successfully");
        loggerChain.handle(LogLevel.DEBUG, "User clicked on Login page");
        loggerChain.handle(LogLevel.ERROR, "Database connection failed");

        loggerChain.handle(LogLevel.WARN, "DISK Space is low");



    }
}
