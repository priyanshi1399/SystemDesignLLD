package ChainOfResponsibility;

public class DEBUGLogger extends LoggerHandler{
    @Override
    protected boolean shouldHandle(LogLevel level) {
        return level==LogLevel.DEBUG;
    }

    @Override
    protected void log(String message) {
        System.out.println("[DEBUG]" +message);
    }
}
