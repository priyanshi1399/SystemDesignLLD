package ChainOfResponsibility;

public class InfoLogger extends LoggerHandler{
    @Override
    protected boolean shouldHandle(LogLevel level) {
        return level==LogLevel.INFO;

    }

    @Override
    protected void log(String message) {
        System.out.println("[INFO]" +message);
    }
}
