package AbstractFactoryExample;

public class Toyata implements Vehicle{
    @Override
    public void start() {
        System.out.println("Toyata is starting");
    }

    @Override
    public void stop() {
        System.out.println("Toyata is stopped");
    }
}
