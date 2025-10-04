package DecoratorExamplecoffee;

public class CoffeeShop {

    public static void main(String[] args) {

        Coffee coffee=new Expresso();
        coffee=new MilkDecorator(coffee);
        coffee=new SugarDecorator(coffee);
        coffee=new vanillaDecorator(coffee);


        System.out.println("This coffee is : "+coffee.getName());
        System.out.println("Total cost is :"+coffee.getCost());
    }
}
