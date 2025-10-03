package AbstractFactoryExample;

public class Honda implements  Vehicle{
    @Override
    public void start() {
        System.out.println("honda is starting");
    }

    @Override
    public void stop() {
        System.out.println("honda is stopped");
    }
}
