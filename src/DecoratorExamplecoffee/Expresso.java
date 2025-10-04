package DecoratorExamplecoffee;

public class Expresso implements Coffee{
    @Override
    public String getName() {
        return "Expresso";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
