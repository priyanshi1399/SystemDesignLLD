package ChainOfResponsibility;



public abstract  class LoggerHandler {

    protected LoggerHandler nextHandler;

    public LoggerHandler setNext(LoggerHandler nextHandler){
        this.nextHandler=nextHandler;
        return nextHandler;
    }
    protected  abstract boolean shouldHandle(LogLevel level);

    protected abstract void log(String message);

    public void handle(LogLevel level, String message){
        if(shouldHandle(level)){
            log(message);
        }
        if(nextHandler!=null){
            nextHandler.handle(level,message);
        }
    }



}
