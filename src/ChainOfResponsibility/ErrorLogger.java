package ChainOfResponsibility;

public class ErrorLogger extends LoggerHandler{
    @Override
    protected boolean shouldHandle(LogLevel level) {
        return level==LogLevel.ERROR;
    }

    @Override
    protected void log(String message) {
        System.out.println("[ERROR]" +message);
    }
}
