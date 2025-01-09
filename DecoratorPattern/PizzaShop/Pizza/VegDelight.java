package DecoratorPattern.PizzaShop.Pizza;

public class VegDelight extends  BasePizza{
    @Override
    public int cost() {
        System.out.println("Base Pizza is VegDelight");
        return 120;
    }
}
