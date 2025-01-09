package DecoratorPattern.PizzaShop.Pizza;



public class Margherita extends  BasePizza{

    @Override
    public int cost() {
        System.out.println("Base Pizza is Margherita");

        return 100;
    }
}

