package DecoratorStructuralDesignPattern;

public class ExtraMushroom extends ToppingDecorator{

    BasePizza basePizza;

    public ExtraMushroom(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int getCost() {
        return basePizza.getCost()+90;
    }
}
