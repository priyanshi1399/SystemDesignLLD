package DecoratorExamplecoffee;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee=coffee;
    }
    @Override
    public String getName() {
       return coffee.getName();
    }

    @Override
    public int getCost() {
        return coffee.getCost();
    }
}
