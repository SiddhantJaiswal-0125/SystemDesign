package DecoratorPattern.PizzaShop.Toppings;

import DecoratorPattern.PizzaShop.Pizza.BasePizza;

public class ExtraJalepenoDecorator extends ToppingDecorator{

    BasePizza basePizza;
    public ExtraJalepenoDecorator(BasePizza bp)
    {
        this.basePizza = bp;
    }
    @Override
    public int cost()
    {
        System.out.println("Adding Toppings Extra Jalepeno");
        return  basePizza.cost() + 35;
    }
}
