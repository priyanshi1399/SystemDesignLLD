package DecoratorExamplecoffee;

public class Cuppuccino implements Coffee{
    @Override
    public String getName() {
        return "Cuppucino";
    }

    @Override
    public int getCost() {
        return 400;
    }
}
