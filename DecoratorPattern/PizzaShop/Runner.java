package DecoratorPattern.PizzaShop;

import DecoratorPattern.PizzaShop.Pizza.BasePizza;
import DecoratorPattern.PizzaShop.Pizza.VegDelight;
import DecoratorPattern.PizzaShop.Toppings.ExtraCheeseDecorator;
import DecoratorPattern.PizzaShop.Toppings.ExtraJalepenoDecorator;
import DecoratorPattern.PizzaShop.Toppings.ExtraMushroomDecorator;

public class Runner {
    public static void main(String[] args) {
        BasePizza myPizza = new ExtraCheeseDecorator(new ExtraMushroomDecorator(new ExtraJalepenoDecorator(new VegDelight()
        )
        )
        );
        System.out.println(myPizza.cost());
        myPizza = new ExtraCheeseDecorator(myPizza);
        System.out.println(myPizza.cost());

    }
}
