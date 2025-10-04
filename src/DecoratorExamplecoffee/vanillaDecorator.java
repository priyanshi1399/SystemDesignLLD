package DecoratorExamplecoffee;

public class vanillaDecorator extends CoffeeDecorator{
    public vanillaDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getName() {
        return coffee.getName() + ", Vanilla";
    }
    @Override
    public int getCost() {
        return coffee.getCost() + 65;
    }

}
