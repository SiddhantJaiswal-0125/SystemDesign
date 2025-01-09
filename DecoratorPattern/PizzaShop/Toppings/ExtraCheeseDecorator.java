package DecoratorPattern.PizzaShop.Toppings;

import DecoratorPattern.PizzaShop.Pizza.BasePizza;

public class ExtraCheeseDecorator extends  ToppingDecorator{
    BasePizza basePizza;
    public ExtraCheeseDecorator(BasePizza bp)
    {
        this.basePizza = bp;
    }
    @Override
    public int cost() {
        System.out.println("Adding Toppings Extra Cheese");

        return  basePizza.cost()+25;

    }
}
