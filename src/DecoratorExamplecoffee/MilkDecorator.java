package DecoratorExamplecoffee;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getName() {
        return coffee.getName() + ", Milk";
    }
    @Override
    public int getCost() {
        return coffee.getCost() + 75;
    }

}
