package DecoratorPattern.PizzaShop.Toppings;

import DecoratorPattern.PizzaShop.Pizza.BasePizza;

public class ExtraMushroomDecorator extends  ToppingDecorator{
    BasePizza basePizza;

    public ExtraMushroomDecorator(BasePizza bp)
    {
        this.basePizza = bp;
    }
    @Override
    public int cost() {
        System.out.println("Adding Toppings Extra Mushroom");
        return basePizza.cost() + 45;
    }
}
