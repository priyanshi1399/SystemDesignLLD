package DecoratorStructuralDesignPattern;

public class ExtraCheese extends ToppingDecorator{

    BasePizza basepizza;

    public ExtraCheese(BasePizza basePizza){
        this.basepizza=basePizza;
    }
    @Override
    public int getCost() {
        return basepizza.getCost()+10;
    }
}
