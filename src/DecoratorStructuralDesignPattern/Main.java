package DecoratorStructuralDesignPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza=new FarmHouse();
        basePizza=new ExtraMushroom(basePizza);
        basePizza=new ExtraCheese(basePizza);

        System.out.println("The total cost of basePizza + Mushroom+ Cheese is :"+basePizza.getCost());
    }
}
